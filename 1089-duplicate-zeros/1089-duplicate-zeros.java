class Solution {
    public void duplicateZeros(int[] arr) {
        int posDup = 0;
        int len = arr.length - 1;
        for(int i=0; i<= len - posDup; i++){
            if(arr[i] == 0){
                if(i == len - posDup){
                    // System.out.print(i);
                    arr[len] = 0;
                    len -= 1;
                    break;
                }
                posDup++;                
            }
        }
        int last = len - posDup;
        for(int i = last; i >= 0; i--){
            if(arr[i] == 0){
                arr[i+posDup] = 0;
                posDup--;
                arr[i+posDup] = 0;

            }else{
                arr[i+posDup] = arr[i];
            }
        }
    }
}