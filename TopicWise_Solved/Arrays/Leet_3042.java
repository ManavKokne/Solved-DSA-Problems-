/*
    3042. Count Prefix and Suffix Pairs I

    Let's define a boolean function isPrefixAndSuffix that takes two strings, str1 and str2:
    isPrefixAndSuffix(str1, str2) returns true if str1 is both a prefix and a suffix of str2, and false otherwise. For example, isPrefixAndSuffix("aba", "ababa") is true because "aba" is a prefix of "ababa" and also a suffix, but isPrefixAndSuffix("abc", "abcd") is false.
    Return an integer denoting the number of index pairs (i, j) such that i < j, and isPrefixAndSuffix(words[i], words[j]) is true.
*/

class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int res = 0;

        for(int i=0; i<words.length; i++){
            for(int j=i+1; j<words.length; j++){
                if(words[j].startsWith(words[i]) && words[j].endsWith(words[i])){
                    res++;
                }
            }
        }
        return res;
        
    }
}