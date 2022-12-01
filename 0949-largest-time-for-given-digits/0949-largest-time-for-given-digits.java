class Solution {
    public String largestTimeFromDigits(int[] arr) {
        String res = "";
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                for(int k = 0; k < 4; k++){
                    if(i == j || i == k || j == k) continue;
                    String m = "" + arr[i] + arr[j], s = "" + arr[k] + arr[6 - i - j - k], t = m + ":" + s;
                    if(m.compareTo("24") < 0 && s.compareTo("60") < 0 && res.compareTo(t) < 0)
                        res = t;
                }
            }
        }
        return res;
    }
}