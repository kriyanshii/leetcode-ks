class CacheEntry {
    public int key;
    public int value;
    public CacheEntry next;
    public CacheEntry prev;
    public CacheEntry(int key, int value) {
        this.key=key;
        this.value=value;
        next=null;
        prev=null;
    }
}

class Cache {
    public CacheEntry head;
    public CacheEntry tail;
    public int size;
    public int capacity;
    public Cache(int capacity) {
        this.size=0;
        this.capacity=capacity;
        this.head=null;
        this.tail=null;
    }
    public CacheEntry evict() {
        if(this.head==null) return null;
        CacheEntry cacheEntry=this.head;
        this.head=this.head.next;
        if(this.head==null) this.tail=null;
        else this.head.prev=null;
        this.size--;
        return cacheEntry;
    }
    public void add(CacheEntry cacheEntry) {
        if(this.size>=this.capacity) return;
        if(this.head==null) {
            this.head=cacheEntry;
            this.tail=cacheEntry;
        }
        else {
            this.tail.next=cacheEntry;
            cacheEntry.prev=this.tail;
            this.tail=this.tail.next;
        }
        this.size++;
        return;
    }
    public void remove(CacheEntry cacheEntry) {
        if(this.head==null) return;
        else if(this.size==1) {
            this.head=null;
            this.tail=null;
        }
        else if(cacheEntry==this.head) {
            this.head=this.head.next;
            this.head.prev=null;
        }
        else if(cacheEntry==this.tail) {
            this.tail=this.tail.prev;
            this.tail.next=null;
        }
        else {
            CacheEntry prev=cacheEntry.prev;
            CacheEntry next=cacheEntry.next;
            prev.next=next;
            next.prev=prev;
        }
        this.size--;
        return;
    }
}

class LRUCache extends Cache {
    HashMap<Integer, CacheEntry> mp;

    public LRUCache(int capacity) {
        super(capacity);
        mp=new HashMap<Integer, CacheEntry>();
    }
    
    public int get(int key) {
        if(!mp.containsKey(key)) return -1;
        CacheEntry cacheEntry=mp.get(key);
        this.remove(cacheEntry);
        this.add(cacheEntry);
        return cacheEntry.value;
    }
    
    public void put(int key, int value) {
        if(mp.containsKey(key)) {
            CacheEntry cacheEntry=mp.get(key);
            cacheEntry.value=value;
            this.remove(cacheEntry);
            this.add(cacheEntry);
            return;
        }
        CacheEntry cacheEntry=new CacheEntry(key, value);
        mp.put(key, cacheEntry);
        if(this.size<this.capacity) this.add(cacheEntry);
        else {
            CacheEntry evictEntry=this.evict();
            // System.out.println(evictEntry.key);
            mp.remove(evictEntry.key);
            this.add(cacheEntry);
        }
        return;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */