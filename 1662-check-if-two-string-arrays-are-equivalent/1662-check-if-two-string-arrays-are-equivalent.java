class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String concat1 = "", concat2 = "";
        for(String word: word1){
            concat1 += word;
        }
        for(String word: word2){
            concat2 += word;
        }
        return concat1.equals(concat2);
    }
}