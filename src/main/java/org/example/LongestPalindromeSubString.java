package org.example;

/*

Given a string s, return the longest palindromic substring in s.



Example 1:

Input: s = "babad"
Output: "bab"
Explanation: "aba" is also a valid answer.
Example 2:

Input: s = "cbbd"
Output: "bb"


 */

public class LongestPalindromeSubString {

    public String longestPalindrome(String s) {

        if (s == null || s.length() < 2) {
            return s;
        }

        String res = "";
        for (int i = 0; i < s.length() - 1; i++) {
            String str1 = getPalin(s, i, i);
            String str2 = getPalin(s, i, i + 1);
            if (str1.length() > res.length()) {
                res = str1;
            }
            if (str2.length() > res.length()) {
                res = str2;
            }
        }

        return res;

    }

    private String getPalin(String s, int l , int r) {
        while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
            l--;
            r++;
        }
        return s.substring(l + 1, r);
    }


    static void main() {
        LongestPalindromeSubString obj = new LongestPalindromeSubString();
        String s = "babad";
        String result = obj.longestPalindrome(s);
        System.out.println("Longest Palindromic Substring: " + result);
    }


}
