package leetcode;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LongestSubString {
    public static void main(String[] args) {
        LongestSubString longestSubString = new LongestSubString();
        int output = longestSubString.lengthOfLongestSubstring1("babacd");
        System.out.println(output);
    }

    public int lengthOfLongestSubstring(String s) {
        String subString = "";
        Map<Character, Integer> NonRepeatChars = new HashMap<>();
        Map<String, Integer> output = new HashMap<>();
        int cnt =1;
        int subStringLength = -1;
        int j=0;
        for (int i=j; i<=s.length(); i++) {
            if (!NonRepeatChars.containsKey(s.charAt(i))){
                NonRepeatChars.put(s.charAt(i), cnt);
                cnt++;
            }else{
                i=j++;
                continue;
            }
            if (subStringLength < NonRepeatChars.size()){
                subStringLength = NonRepeatChars.size();
                subString = subString + String.valueOf(s.charAt(i));
                if (!output.containsKey(subString)) {
                    output.put(subString, subStringLength);
                }
            }
        }
        return output.get(subString);
    }

    public int lengthOfLongestSubstring1(String s) {
        Map<Character, Integer> subStrings = new LinkedHashMap<>();
        String longestSubString = null;
        int longestSubStringLength = 0;
        char[] chars = s.toCharArray();

        for (int i=0; i<chars.length; i++){
            char ch = chars[i];

            if (!subStrings.containsKey(ch)){
                subStrings.put(ch, i);
            }else{
                i = subStrings.get(ch);
                subStrings.clear();
            }

            if (longestSubStringLength < subStrings.size()){
                longestSubStringLength = subStrings.size();
                longestSubString = subStrings.keySet().toString();
            }
        }

        System.out.println(longestSubString);
        return longestSubStringLength;
    }
}
