class Solution {
    public boolean canReach(int[] arr, int start) {
        int n = arr.length;
        HashSet<Integer> set = new HashSet<>();
        Queue<Integer> q = new LinkedList<>();
        q.offer(start);
        while(!q.isEmpty()){
            int index = q.poll();
            if(arr[index] == 0) return true;
            if(set.contains(index)) continue;
            set.add(index);
            if(index + arr[index] < n) q.add(index + arr[index]);
            if(index - arr[index] >= 0) q.add(index - arr[index]);
        }
        return false;
    }
}