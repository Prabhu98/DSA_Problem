package org.example;

import org.junit.jupiter.api.Test;

public class ReverseWordsInString {

    @Test
    public void td1() {
        String s = "ab-cd-e1";
        System.out.println(reverseOnlyLetters(s));

    }

    public String reverseOnlyLetters(String s)
    {

        int start = 0;
        int end = s.length()-1;
        char[] arr = s.toCharArray();
        while(start < end){
            if(isLetter(arr[start]) && isLetter(arr[end])){
                char temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }else if(!isLetter(arr[start])){
                start++;
            }else if(!isLetter(arr[end])){
                end--;
            }
        }
        return String.valueOf(arr);

    }

    public static boolean isLetter(char ch){
        boolean flag = false;
        if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')){
            flag = true;
        }
        return flag;
    }

}
