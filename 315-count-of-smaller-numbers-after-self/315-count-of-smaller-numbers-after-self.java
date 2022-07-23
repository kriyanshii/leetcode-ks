class Solution {
    private class ArrayWithOrgIdx{
        int val;
        int originalIdx;
        public ArrayWithOrgIdx(int val, int originalIdx){
            this.val = val;
            this.originalIdx = originalIdx;
        }
    }
    
    public List<Integer> countSmaller(int[] nums) {
        if(nums == null || nums.length == 0){
            return new LinkedList<Integer>();
        }
        int n = nums.length;
        int[] result = new int[n];
        
        ArrayWithOrgIdx[] newNums = new ArrayWithOrgIdx[n];
        for(int i = 0; i < nums.length; i++){
            newNums[i] = new ArrayWithOrgIdx(nums[i], i);
        }
        mergeSortAndCount(newNums, 0, n - 1, result);
        List<Integer> resultList = new LinkedList<>();
        for(int i: result){
            resultList.add(i);
        }
        return resultList;
    }
    
    public void mergeSortAndCount(ArrayWithOrgIdx[] nums, int start, int end, int[] result){
        if(start >= end)  return;
        
        int mid = (start + end)/2;
        mergeSortAndCount(nums, start, mid, result);
        mergeSortAndCount(nums, mid + 1, end, result);
        int leftPos = start;
        int rightPos = mid + 1;
        LinkedList<ArrayWithOrgIdx> merged = new LinkedList<ArrayWithOrgIdx>();
        int lessThanArray = 0;
        while(leftPos < mid + 1 && rightPos <= end){
            if(nums[leftPos].val > nums[rightPos].val){
                ++lessThanArray;
                merged.add(nums[rightPos]);
                ++rightPos;
            }else{
                result[nums[leftPos].originalIdx] += lessThanArray;
                merged.add(nums[leftPos]);
                ++leftPos;
            }
        }
        while(leftPos <= mid){
            result[nums[leftPos].originalIdx] += lessThanArray;
            merged.add(nums[leftPos]);
            ++leftPos;
        }
        while(rightPos <= end){
            merged.add(nums[rightPos]);
            rightPos++;
        }
        
        int pos = start;
        for(ArrayWithOrgIdx m: merged){
            nums[pos] = m;
            pos++;
        }
    } 

}