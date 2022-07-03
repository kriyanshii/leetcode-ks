/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] mat = new int[m][n];
        int cnt = 0;
        
        int lb = 0, rb = n - 1;
        int c = 0, f = m - 1;
        while(cnt < m*n){
            for(int i = lb; i <= rb; i++){
                cnt++;
                if(head != null){
                    mat[c][i] = head.val;
                    head = head.next;
                }else{
                    mat[c][i] = -1;
                }
            }
            
            for(int i = c + 1; i <= f; i++){
                cnt++;
                if(head != null){
                    mat[i][rb] = head.val;
                    head = head.next;
                }else{
                    mat[i][rb] = -1;
                }
            }
            
            if(f != c){
                for(int i = rb - 1; i >= lb; i--){
                    cnt++;
                    if(head != null){
                        mat[f][i] = head.val;
                        head = head.next;
                    }else{
                        mat[f][i] = -1;
                    }
                }
            }
            if(rb != lb){
                for(int i = f - 1; i > c; i--){
                    cnt++;
                    if(head != null){
                        mat[i][lb] = head.val;
                        head = head.next;
                    }else{
                        mat[i][lb] = -1;
                    }
                }
            }
            lb++;
            rb--;
            f--;
            c++;
        }
        return mat;
    }
}