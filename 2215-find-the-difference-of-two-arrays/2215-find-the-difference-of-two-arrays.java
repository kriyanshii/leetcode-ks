class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1=new HashSet<>();
        Set<Integer> set2=new HashSet<>();
        List<Integer> list1=new ArrayList<>();
        List<Integer> list2=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();

        for(int e: nums1) set1.add(e);
        for(int e: nums2) set2.add(e);

        for(int e: set1) if(!set2.contains(e)) list1.add(e);
        for(int e: set2) if(!set1.contains(e)) list2.add(e);

        ans.add(list1);
        ans.add(list2);

        return ans;
    }
}