int i = m - 1, j = n -1, here = m + n - 1;
while(i>=0 && j>=0){
if(nums1[i] >= nums2[j]){
nums1[here--] = nums1[i--];
}else{
nums1[here--] = nums2[j--];
}
}
while(j>=0){
nums1[here--] = nums2[j--];
}