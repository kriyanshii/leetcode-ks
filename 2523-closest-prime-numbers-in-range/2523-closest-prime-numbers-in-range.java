class Solution {
    // public int[] closestPrimes(int left, int right) {
    //     boolean[] primes = sieveOfEratosthenes(right);
    //     List<Integer> list = new ArrayList<>();
    //     if(left <= 1) left = 2;
    //     for(int i = left; i <= right; i++){
    //         if(primes[i]) list.add(i);
    //     }
    //     if(list.isEmpty()) return new int[]{-1, -1};
    //     int l = -1, r = -1, diff = 999999;
    //     int s1 = list.remove(0);
    //     while(!list.isEmpty()){
    //         int s2 = list.remove(0);
    //         if(s2 - s1 < diff){
    //             l = s1;
    //             r = s2;
    //             diff = l - r;
    //         }
    //         s1 = s2;
    //     }
    //     return new int[]{l, r};
    // }
    
    public int[] closestPrimes(int left, int right) {
        var primes = sieveOfEratosthenes(right);  
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        if(left <= 1) left = 2;
        for(int i = left; i <= right; i++) {
            if(primes[i]) pq.add(i);
        }
        if(pq.isEmpty()) return new int[]{-1,-1};
        int l = -1,r = -1,diff = 999999;
        int s1 = pq.poll();
        while(!pq.isEmpty()) {
            int s2 = pq.poll();
            if(s2 - s1 < diff) {
                l = s1;
                r = s2;
                diff = r - l;
            }
            s1 = s2;
        }
        return new int[]{l,r};
    }
    public boolean[] sieveOfEratosthenes(int n) {
        boolean[] prime = new boolean[n + 1];
        for(int i = 0; i <= n; i++){
            prime[i] = true;
        }
        for(int i = 2; i*i <= n; i++){
            if(prime[i] == true){
                for(int p = i*i; p <= n; p+=i){
                    prime[p] = false;
                }
            }
        }
        return prime;
    }
}