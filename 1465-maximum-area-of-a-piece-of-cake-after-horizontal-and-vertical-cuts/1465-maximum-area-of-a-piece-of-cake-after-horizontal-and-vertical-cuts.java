class Solution {
    public int maxArea(int h, int w, int[] hc, int[] vc) {
        Arrays.sort(hc);
        Arrays.sort(vc);
        int maxH = Math.max(hc[0], h - hc[hc.length - 1]);
        int maxV = Math.max(vc[0], w - vc[vc.length - 1]);
        for(int i = 1; i < hc.length; i++){
            maxH = Math.max(maxH, hc[i] - hc[i - 1]);
        }
        for(int i = 1; i < vc.length; i++){
            maxV = Math.max(maxV, vc[i] - vc[i - 1]);
        }
        return (int)((long)maxH * maxV % 1000000007);
    }
}