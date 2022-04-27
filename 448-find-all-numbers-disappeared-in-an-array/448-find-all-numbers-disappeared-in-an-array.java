class Solution {
    public List<Integer> findDisappearedNumbers(int[] arr) {
        int i = 0, temp;
        while(i < arr.length){
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]){
                temp=arr[i];
                arr[i]=arr[correct];
                arr[correct]=temp;
            }else{
                i++;
            }
        }
        List <Integer> res = new ArrayList<Integer>();
        for(int j=0; j<arr.length; j++){
            if(arr[j] != j + 1){
                res.add(j + 1);
            }
        }
        return res;
    }
}