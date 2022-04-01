/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is lower than the guess number
 *			      1 if num is higher than the guess number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int start = 1, end = n;
        while(start <= end){
            int mid = start + (end - start)/2;
            int ans = guess(mid);
            if(ans == 0){
                return mid;
            }else if(ans < 0){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return -1;
    }
}