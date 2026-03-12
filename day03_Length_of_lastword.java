class Solution {
    public int lengthOfLastWord(String s) {
       
       String [] word = s.split(" ");

       int length =  word[word.length-1].length();
       return length;

    }
}