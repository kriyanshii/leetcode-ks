class Solution {
    public String removeDuplicates(String s, int k) {
        int i=0, n=s.length(), count[] = new int[n];
        char[] res = s.toCharArray();
        for(int j=0; j<n; j++, i++){
            res[i] = res[j];
            count[i] = i > 0 && res[i-1] == res[j]  ? count[i - 1] + 1 : 1;
            if(count[i] == k) i-= k;
        }
        return new String(res,0, i);
    }
}