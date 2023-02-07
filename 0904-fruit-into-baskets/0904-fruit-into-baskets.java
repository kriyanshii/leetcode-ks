class Solution {
    public int totalFruit(int[] fruits) {
        Map<Integer, Integer> map = new HashMap<>();
        int i = 0, j;
        for(j = 0; j <  fruits.length; j++){
            map.put(fruits[j], map.getOrDefault(fruits[j], 0) + 1);
            if(map.size() > 2){
                map.put(fruits[i], map.get(fruits[i]) - 1);
                // System.out.println(map.remove(fruits[i++], 0));
                map.remove(fruits[i++], 0);
            }
        }
        return j - i;
    }
}