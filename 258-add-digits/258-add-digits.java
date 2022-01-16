class Solution {
    static int sum(int num){
        int totalSum = 0;
        while(num > 0){
            totalSum += num%10;
            num /=10;
        }
        return totalSum;
    }
    public int addDigits(int num) {
        while(num > 9){
            num = sum(num);
        }
        return num;
    }
}