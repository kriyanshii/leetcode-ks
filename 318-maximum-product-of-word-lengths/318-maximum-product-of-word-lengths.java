class Solution {
    public int maxProduct(String[] words) {
        int n = words.length;
        int[] mask = new int[n];
        for(int i = 0; i < n; i++){
            for(char c : words[i].toCharArray()){
                mask[i] |= (1 << (c - 'a'));
            }
        }
        int largest = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i != j && (mask[i] & mask[j]) == 0){
                    largest = Math.max(largest, words[i].length() * words[j].length());
                }
            }
        }
        return largest;
    }
}