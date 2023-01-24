class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int i, j;
        Arrays.sort(people);
        for(i = 0, j = people.length - 1; i <= j; j--){
            if(people[i] + people[j] <= limit){
                ++i;
            }
        }
        return people.length - 1 - j;
    }
}