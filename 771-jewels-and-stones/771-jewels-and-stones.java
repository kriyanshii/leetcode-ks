class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int res = 0;
        Set setJ = new HashSet();
        for(char j : jewels.toCharArray()){
            setJ.add(j);
        }
        for(char s : stones.toCharArray()){
            if(setJ.contains(s)) res++;
        }
        return res;
    }
}