class Solution {
    public int computeArea(int a, int b, int c, int d, int e, int f, int g, int h) {
        int areaA = (c - a) * (d - b);
        int areaB = (g - e) * (h - f);
        int left = Math.max(a, e);
        int right = Math.min(g, c);
        int bottom = Math.max(b, f);
        int top = Math.min(d, h);
        
        int overlap = 0;
        if(right > left && top > bottom){
            overlap = (right - left) * (top - bottom);
        }
        return areaA + areaB - overlap;
    }
}