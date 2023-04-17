class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<Boolean>();
        int max = candies[0];
        // for loop for getting max from the array
        for (int i : candies) {
            if (i > max) {
                max = i;
            }
        }
        // trying brute force approach for finding if max <= candies[i] + extra
        for (int j : candies) {
            j += extraCandies;
            if (j >= max) {
                list.add(true);
            } else {
                list.add(false);
            }
        }
        return list;
    }
}