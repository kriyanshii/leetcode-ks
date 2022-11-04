class Solution {
    public String reverseVowels(String s) {
        if(s == null || s.length() == 0) return s;
        String vowels = "aeiouAEIOU";
        int start = 0;
        int end = s.length() - 1;
        char[] arr = s.toCharArray();
        while(start < end){
            while(start < end && !vowels.contains(arr[start] + "")){
                start++;
            }
            while(start < end && !vowels.contains(arr[end] + "")){
                end--;
            }
            
            char tmp = arr[start];
            arr[start] = arr[end];
            arr[end] = tmp;
            
            start++;
            end--;
        }
        return new String(arr);
    }
}