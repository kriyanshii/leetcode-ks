class Solution {
    public int countEven(int num) {
        int sum = num % 10 + (num / 10) % 10 + (num / 100) % 10 + (num / 1000) % 10;
        return (num - (sum & 1))/2;
    }
}