package leetcode;

class Solution {
    public static String mergeAlternately(String word1, String word2) {
        int i =0, j = 0;
        StringBuilder str = new StringBuilder();
        int m = word1.length();
        int n = word2.length();
        while(i < m && j< n)
        {
            str.append(word1.charAt(i));
            str.append(word2.charAt(j));
            i++;
            j++;
        }
        while(i > word1.length()){
            str.append(word1.charAt(i));
            i++;
        }
        while(j > word2.length()){
            str.append(word1.charAt(j));
            j++;
        }
        return str.toString();
    }
    public static void main(String[] args){
        String word1 = "abc";
        String word2 = "pqr";
        mergeAlternately(word1,word2);
    }
}
