class Solution {
    public List<Integer> findDisappearedNumbers(int[] arr) {
        int i = 0;
        while(i < arr.length){
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]){
                swap(arr, i, correct);
            }else{
                i++;
            }
        }
        List <Integer> res = new ArrayList<Integer>();
        for(int j=0; j<arr.length; j++){
            if(arr[j] - 1 != j){
                res.add(j + 1);
            }
        }
        return res;
    }
    
    public void swap(int[] arr, int i, int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}