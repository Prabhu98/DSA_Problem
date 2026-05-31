package org.example;

import org.junit.jupiter.api.Test;

public class IntegerToRoman {


    @Test
    public void td1() {
        int num = 3000;
        String roman = intToRoman(num);
        System.out.println("Roman numeral for " + num + " is: " + roman);
    }

    public String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();

        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        for(int i=0;i<values.length;i++){
            while(num >= values[i]){
                sb.append(symbols[i]);
                num -= values[i];

            }
        }
        return sb.toString();
    }
}
