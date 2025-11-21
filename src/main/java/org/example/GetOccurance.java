package org.example;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class GetOccurance {

    @Test
    public void td1() {
        String s = "aaabbaa";
        String occurance = getOccuranceIII(s);
        System.out.println(occurance);
    }

    public String getOccurance(String s) {
        StringBuilder sb = new StringBuilder();

        int start = 0;
        int end = 0;
        int count =0;

        while(end < s.length()){
            if(s.charAt(start) == s.charAt(end)){
                count++;
                end++;
            }
            else {
                sb.append(s.charAt(start));
                sb.append(count);
                start = end;
                count=0;
            }
        }

        sb.append(s.charAt(start));
        sb.append(count);


        return sb.toString();
    }

    public String getOccuranceIII(String s){

        StringBuilder sb = new StringBuilder();

        Map<Character,Integer> hmap = new HashMap<>();

        int start =0;
        int end =0;

        while(end < s.length()){
            if(s.charAt(start) == s.charAt(end)) {
                char ch = s.charAt(end);
                hmap.put(ch,hmap.getOrDefault(ch,0)+1);
                end++;
            }
            else if(s.charAt(start) != s.charAt(end)){
                for(Map.Entry<Character,Integer> entry : hmap.entrySet()){
                    sb.append(entry.getKey());
                    sb.append(entry.getValue());
                }
                hmap.clear();
                start = end;
            }

        }

        for(Map.Entry<Character,Integer> entry : hmap.entrySet()){
            sb.append(entry.getKey());
            sb.append(entry.getValue());
        }

        return sb.toString();
    }

}
