class Solution {
    public String reorganizeString(String s) {
        int[] freq = new int[26];
        int max = 0, letter = 0;
        for(int i = 0; i < s.length(); i++){
            freq[s.charAt(i) - 'a']++;
        }
        for(int i = 0; i < freq.length; i++){
            if(max < freq[i]){
                max = freq[i];
                letter = i;
            }
        }
        if(max > (s.length() + 1)/ 2) return "";
        
        char[] res = new char[s.length()];
        int idx = 0;
        while(freq[letter] > 0){
            res[idx]  = (char)(letter + 'a');
            idx += 2;
            freq[letter]--;
        }
        for(int i = 0; i < freq.length; i++){
            while(freq[i] > 0){
                if(idx >= res.length){
                    idx = 1;
                }
                res[idx] = (char)(i + 'a');
                idx += 2;
                freq[i]--;
            }
        }
        return String.valueOf(res);
    }
}