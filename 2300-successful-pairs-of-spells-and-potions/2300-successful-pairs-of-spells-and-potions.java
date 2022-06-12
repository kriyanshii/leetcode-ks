class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int[] spells0 = spells.clone();
        int[] pairs = new int[spells.length];
        Arrays.sort(potions);        
        Arrays.sort(spells);
        HashMap<Integer, Integer> count = new HashMap<>();
        int n = spells.length, m = potions.length, j = m - 1;
        for(int i = 0; i < spells.length; i++){
            while(j >= 0 && 1L * spells[i] * potions[j] >= success){
                j--;
            }
            count.put(spells[i], m - j -1);
        }
        for(int i = 0; i < n; i++){
            pairs[i] = count.get(spells0[i]);
        }
        return pairs;
    }
}