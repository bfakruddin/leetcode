package leetcode;

import java.util.*;

public class RomanToInteger {

    public static void main(String[] args) {
//        I             1
//        V             5
//        X             10
//        L             50
//        C             100
//        D             500
//        M             1000

        RomanToInteger romanToInteger = new RomanToInteger();
        System.out.println(romanToInteger.romanToInt("DCCC"));

    }

    public int romanToInt(String s) {
        // Regular expression to find out invalid inputs
        // e.g. IIII, XXXX, LL, CCCC, DD, VX, VL, VC, VD, VM
        if (s.length()>15 || s.length()<1 || s.matches("MMMM|IIII.*|XXXX.*|LL.*|CCCC.*|DD.*|VX.*|VL.*|VC.*|VD.*|VM.*")) {
            return -1;
        }

        Map<String, Integer> constVals = new TreeMap<>();
        constVals.put("IV", 4);
        constVals.put("IX", 9);
        constVals.put("XL", 40);
        constVals.put("XC", 90);
        constVals.put("CD", 400);
        constVals.put("CM", 900);
        constVals.put("I", 1);
        constVals.put("V", 5);
        constVals.put("X", 10);
        constVals.put("L", 50);
        constVals.put("C", 100);
        constVals.put("D", 500);
        constVals.put("M", 1000);

        Integer output = 0;
        for (int i=0; i<s.length(); i++){
            if ((i+2 <= s.length()) && constVals.containsKey(s.substring(i, i+2))){
                output = output + constVals.get(s.substring(i, i+2));
                i++;
            }else if (constVals.containsKey(s.substring(i, i+1))){
                output = output + constVals.get(s.substring(i, i+1));
            }
        }

        return output;
    }

    private int translate(char c){
        switch (c){
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;

        }
    }
    public int romanToInt1(String s) {
        int sum = 0;
        int curr = translate(s.charAt(0));

        for (int i = 1; i < s.length(); i++){
            int next = translate(s.charAt(i));
            if (curr < next)
                sum -= curr;
            else{
                sum += curr;
            }
            curr = next;
        }
        sum += curr;
        return sum;
    }

}
