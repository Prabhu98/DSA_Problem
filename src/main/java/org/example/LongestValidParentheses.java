package org.example;

/*
Given a string containing just the characters '(' and ')', return the length of the longest valid (well-formed) parentheses substring.



Example 1:

Input: s = "(()"
Output: 2
Explanation: The longest valid parentheses substring is "()".


 */


public class LongestValidParentheses {



    public int longestValidParentheses(String s) {

        int left =0;
        int right =0;
        int maxLength =0;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                left++;
            }else{
                right++;
            }

            if(left==right){
                maxLength = Math.max(maxLength,2*right);
            }else if(right>left){
                left=right=0;
            }
        }

        left=right=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='('){
                left++;
            }else{
                right++;
            }

            if(left==right){
                maxLength = Math.max(maxLength,2*left);
            }else if(left>right){
                left=right=0;
            }
        }

        return maxLength;
    }

    public static void main() {
        String s = "(())";
        LongestValidParentheses obj = new LongestValidParentheses();
        int result = obj.longestValidParentheses(s);
        System.out.println("Length of longest valid parentheses: " + result);
    }
}
