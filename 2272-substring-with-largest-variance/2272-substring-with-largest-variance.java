class Solution {
    public int largestVariance(String s) {
        int[] freq = new int[26];
        for(char c: s.toCharArray()) freq[c - 'a']++;
        int maxVariance = 0;
        for(int a = 0; a < 26; a++){
            for(int b = 0; b < 26; b++){
                int remainingA = freq[a];
                int remainingB = freq[b];
                if(a == b || remainingA == 0 || remainingB == 0) continue;
                int currAFreq = 0, currBFreq = 0;
                for(int i = 0; i < s.length(); i++){
                    int c = (int)s.charAt(i) - 'a';
                    if(c == b) currBFreq++;
                    if(c == a){
                        currAFreq++;
                        remainingA--;
                    }
                    if(currAFreq > 0){
                        maxVariance = Math.max(maxVariance, currBFreq - currAFreq);
                    }
                    if(currBFreq < currAFreq && remainingA >= 1){
                        currAFreq = 0;
                        currBFreq = 0;
                    }
                }
            }
        }
        return maxVariance;
    }
}