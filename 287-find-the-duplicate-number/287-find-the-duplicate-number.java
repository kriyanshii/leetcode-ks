class Solution {
    public int findDuplicate(int[] arr) {
        int i = 0, temp;
        while(i < arr.length){
            if(arr[i] != i+1){
                int correct = arr[i] - 1;
                if(arr[i] != arr[correct]){
                    swap(arr, i, correct);
                }else{
                    return arr[i];
                }
            }else{
                i++;
            }
        }
        return 0;
    }
    public void swap(int[] arr, int i, int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}