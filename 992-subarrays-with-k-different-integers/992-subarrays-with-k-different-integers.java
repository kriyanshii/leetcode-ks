class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return atMostK(nums, k) - atMostK(nums, k - 1);
    }
    
    public int atMostK(int[] A, int k){
        int i = 0, res = 0;
        HashMap<Integer, Integer> count = new HashMap<>();
        for(int j = 0; j < A.length; j++){
            if(count.getOrDefault(A[j], 0) == 0) k--;
            count.put(A[j], count.getOrDefault(A[j], 0) + 1);
            while(k < 0){
                count.put(A[i], count.get(A[i]) - 1);
                if(count.get(A[i]) == 0) k++;
                i++;
            }
            res += j - i + 1;
        }
        return res;
    }
}