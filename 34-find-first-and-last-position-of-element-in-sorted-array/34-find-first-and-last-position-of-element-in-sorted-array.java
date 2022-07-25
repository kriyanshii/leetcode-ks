class Solution {
    public int[] searchRange(int[] arr, int target){
        int[] position = {-1, -1};
        position[0] = find(arr, target, true);
        if(position[0] != -1){
            position[1] = find(arr, target, false);
        }
        return position;
    }
    
    public int find(int[] nums, int target, boolean doLeft){
        int start = 0;
        int end = nums.length - 1;
        int index = -1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(nums[mid] < target){
                start = mid + 1;
            }else if(nums[mid] > target){
                end = mid - 1;
            }else{
                index = mid;
                if(doLeft){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
        }
        return index;
    }
}