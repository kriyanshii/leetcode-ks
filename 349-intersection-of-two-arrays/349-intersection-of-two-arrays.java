class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<Integer>();
        Arrays.sort(nums2);
        int i= 0;
        int m = nums2.length;
        int n = nums1.length;
        for(int num: nums1){
            if(binarySearch(nums2, num)){
                set.add(num);
            }
        }
        int[] res = new int[set.size()];
        for(Integer num: set){
            res[i++] = num;
        }
        return res;
    }
    public boolean binarySearch(int[] nums, int target){
        int left = 0;
        int right = nums.length - 1;
        while(left <= right){
            int mid = left + (right-left)/2;
            if(nums[mid] == target){
                return true;
            }else if(nums[mid] > target){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return false;
    }
}