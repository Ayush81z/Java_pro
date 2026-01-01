package com.ayush.Maths;

public class romantoint {
    public static void main(String[] args) {
            romantoint sol = new romantoint();

            String s1 = "LVIII";
            String s2 = "MCMXCIV";
            String s3 = "CMV";

            System.out.println(sol.romanToInt(s1)); // expected 58
            System.out.println(sol.romanToInt(s2)); // expected 1994
            System.out.println(sol.romanToInt(s3)); // expected 905
    }


    public int romanToInt(String s) {
        int len = s.length();
        int total = 0;

        for (int i = 0; i < len-1 ; i++) {
            int curr = value(s.charAt(i));
            int next = value(s.charAt(i+1));

            if (curr >= next) {
                total += curr;
            }
            else {
                total -= curr;
            }
        }
        total += value(s.charAt(len-1));
        return total;

    }

    private int value(char ch) {
        switch (ch) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }
}


