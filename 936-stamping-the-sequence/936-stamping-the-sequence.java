class Solution {
    public int[] movesToStamp(String stamp, String target) {
        char[] S = stamp.toCharArray();
        char[] T = target.toCharArray();
        List<Integer> res = new ArrayList<>();
        boolean[] visited = new boolean[T.length];
        int stars = 0;
        while(stars < T.length){
            boolean doChange = false;
            for(int i = 0; i <= T.length - S.length; i++){
                if(!visited[i] && canReplace(T, i, S)){
                    // System.out.println(doChange);
                    stars = doReplace(T, i, S.length, stars);
                    doChange = true;
                    visited[i] = true;
                    res.add(i);
                    if(stars == T.length) break;
                }
            }
            if(!doChange) return new int[0];
        }
        int[] resArray = new int[res.size()];
        for(int i = 0; i < res.size(); i++){
            // System.out.println(res.get(res.size() - i - 1));
            resArray[i] = res.get(res.size() - i - 1);
        }
        return resArray;
    }
    
    public boolean canReplace(char[] T, int p, char[] S){
        for(int i = 0; i < S.length; i++){
            if(T[i + p] != '*' && T[i + p] != S[i]){
                return false;
            }
        }
        return true;
    }
    
    public int doReplace(char[] T, int p, int len, int stars){
        for(int i = 0; i < len; i++){
            if(T[i + p] != '*'){
                T[i + p] = '*';
                stars++;
            }
        }
        return stars;
    }
}