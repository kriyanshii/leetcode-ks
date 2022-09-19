class Solution {
    public List<List<String>> findDuplicate(String[] paths) {
        List<List<String>> list = new ArrayList<>();
        int n = paths.length;
        if(n == 0) return list;
        
        Map<String, Set<String>> map = new HashMap<>();
        for(String path: paths){
            String[] strs = path.split("\\s+");
            for(int i = 1; i < strs.length; i++){
                // System.out.println(strs[i] + " " + path);
                int idx = strs[i].indexOf("(");
                String content = strs[i].substring(idx);
                String filename = strs[0] + "/" + strs[i].substring(0, idx);
                Set<String> filenames = map.getOrDefault(content, new HashSet<>());
                filenames.add(filename);
                map.put(content, filenames);
            }
        }
        for(String key: map.keySet()){
            if(map.get(key).size() > 1){
                list.add(new ArrayList<>(map.get(key)));
            }
        }
        return list;
    }
}