class Solution {
    public int[] numsSameConsecDiff(int n, int k) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        // loop to get list of n digits.
        for(int i = 2; i <= n; i++){
            List<Integer> list1 = new ArrayList<>();
            for(int x: list){
                int y = x % 10;
                if(y + k < 10){
                    list1.add(x * 10 + y + k);
                }
                // this k > 0 check is to ensure that if k = 0 then it will add same digit 2 times. so to ensure that it does not happen here k > 0 is used 
                if(k > 0 && y - k >= 0){
                    list1.add(x * 10 + y - k);
                }
            }
            list = list1;
        }
        return list.stream().mapToInt(j -> j).toArray();
    }
}