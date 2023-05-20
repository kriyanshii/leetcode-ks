class Solution {
    Map<String, String> parents = new HashMap<>();
    Map<String, Double> vals = new HashMap<>();
    
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        double[] res = new double[queries.size()];
        for(int i = 0; i < equations.size(); i++){
            String x = equations.get(i).get(0), y = equations.get(i).get(1);
            union(x, y, values[i]);
        }
        for(int i = 0; i < queries.size(); i++){
            String x = queries.get(i).get(0), y = queries.get(i).get(1);
            res[i] = (parents.containsKey(x) && parents.containsKey(y) && find(x) == find(y) ? vals.get(x) / vals.get(y) : -1.0);
        }
        return res;
    }
    
    public void add(String x){
        if(parents.containsKey(x)){
            return;
        }
        parents.put(x,x);
        vals.put(x, 1.0);
        // System.out.println(vals.get(x));
    }
    
    public String find(String x){
        String p = parents.getOrDefault(x, x);
        if(x != p){
            String pp = find(p);
            vals.put(x, vals.get(x) * vals.get(p));
            parents.put(x, pp);
        }
        return parents.getOrDefault(x,x);
    }
    
    public void union(String x, String y, double v){
        add(x);
        add(y);
        String vx = find(x), vy = find(y);
        parents.put(vx, vy);
        vals.put(vx, v * vals.get(y) / vals.get(x));
        // System.out.println(vx);
        // System.out.println(vy);
        // System.out.println(v);
        // System.out.println(v * vals.get(y) / vals.get(x));
    }
}