class Solution {
    public List<String> restoreIpAddresses(String s) {
        ArrayList<String> list = new ArrayList<>();
        doRestore(list, "", s,  0);
        return list;
    }
    
    public void doRestore(List<String> res, String path, String s, int k){
        if(s.isEmpty() || k == 4){
                // System.out.println("res");
            if(s.isEmpty() && k == 4){
                res.add(path.substring(1));
                // System.out.println(res);
            }
            return;
        }
        
        for(int i = 1; i <= (s.charAt(0) == '0' ? 1 : 3) && i <= s.length(); i++){
            String part = s.substring(0, i);
            if(Integer.valueOf(part) <= 255){
                doRestore(res, path + "." + part, s.substring(i), k+1);
            }
        }
    }
}