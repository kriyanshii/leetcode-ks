class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int l = 0, r = arr.length - k;
        while(l < r){
            int mid = (l + r)/2;
            if(x - arr[mid] > arr[mid + k] - x){
                l = mid + 1;
            }else{
                r = mid;
            }
        }
        return Arrays.stream(arr, l, l + k).boxed().collect(Collectors.toList());
    }
}