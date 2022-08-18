class Solution {
    public int minSetSize(int[] arr) {
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i: arr) map.put(i, map.getOrDefault(i, 0) + 1);
        
        int[] counting = new int[n + 1];
        for(int val: map.values()) counting[val]++;
        
        int ans = 0, half = n / 2, removed = 0, freq = n;
        while(removed < half){
            ans += 1;
            while(counting[freq] == 0) freq--;
            removed += freq;
            --counting[freq];
        }
        return ans;
    }
}