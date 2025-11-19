package org.example;

import java.io.CharConversionException;
import java.util.HashSet;
import java.util.Set;

public class LongestSubStringWithoutRepeatingCharacter {



    public int lengthOfLongestSubstring(String s){

        if(s.isEmpty()){
            return 0;
        }

        int start=0,end=0,currentLength=0,max=Integer.MIN_VALUE;

        Set<Character> set = new HashSet<>();

        while(end < s.length()){

            if(!set.contains(s.charAt(end))){
                set.add(s.charAt(end));
                currentLength = set.size();
                max = Math.max(max,currentLength);
                end++;
            }else{
                set.remove(s.charAt(start));
                start++;
            }

        }


        return max;
    }

    static void main() {
        LongestSubStringWithoutRepeatingCharacter obj = new LongestSubStringWithoutRepeatingCharacter();
        String s = "abcabcbb";
        int length = obj.lengthOfLongestSubstring(s);
        System.out.println("Length of longest substring without repeating characters: " + length);
    }
}
