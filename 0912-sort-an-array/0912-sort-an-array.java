class Solution {
    public int[] sortArray(int[] nums) {
        int max = -50001, min = 50001;
        for(int i: nums){
            if(i < min) min = i;
            if(i > max) max = i;
        }
        //counting each time the number occur
        int[] counter = new int[max - min + 1];
        for(int i: nums){
            counter[i - min]++;
        }
        //now shifting each occured one
        int idx = 0;
        for(int i = min; i <= max; i++){
            int count = counter[i - min];
            while(count-- > 0){
                nums[idx++] = i;
            }
        }
        return nums;
    }
    
}