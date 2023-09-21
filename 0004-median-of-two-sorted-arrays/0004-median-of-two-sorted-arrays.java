import java.util.Arrays;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l1 = nums1.length;
        int l2 = nums2.length;
        int i =0, j=0, k=l1+l2;
        int[] nums3 = new int[k];
        //
        System.arraycopy(nums1, 0, nums3, 0, l1);
        System.arraycopy(nums2, 0, nums3, l1, l2);
        double median = 0;
        Arrays.sort(nums3);
        if(k%2 == 0){
            median = (double)(nums3[(k / 2) -1] + nums3[k / 2]) / 2.0;
        }
        else{
            median = (double)nums3[k/2];
        }
        return median;
    }
}