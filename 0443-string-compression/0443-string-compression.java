class Solution {
    public int compress(char[] chars) {
        int idxAns = 0, idx = 0;
        while(idx < chars.length){
            int cur = idx;
            int count = 0;
            while(idx < chars.length && chars[idx] == chars[cur]){
                idx++;
                count++;
            }
            chars[idxAns++] = chars[cur];
            // System.out.println(chars[idxAns++]);
            if(count != 1){
                for(char c: Integer.toString(count).toCharArray()){
                    chars[idxAns++] = c;
                    // System.out.println(chars[idxAns++]);
                }
            }
        }
        return idxAns;
    }
}