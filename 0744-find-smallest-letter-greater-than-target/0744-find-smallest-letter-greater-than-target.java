class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int n = letters.length;
        int lo = 0, hi = n;
        while(lo < hi){
            int mid = lo + (hi - lo)/2;
            if(letters[mid] > target) hi = mid;
            else lo = mid + 1;
        }
        return letters[lo % n];
    }
}