package leetcode;

import java.util.*;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
//        System.out.println(longestCommonPrefix.longestCommonPrefix(new String[] {"flower", "flirt", "flow", "flame"}));
//        System.out.println(longestCommonPrefix.longestCommonPrefix(new String[] {"dog","racecar","car"}));
        System.out.println(longestCommonPrefix.longestCommonPrefix(new String[] {"a"}));

    }

    public String longestCommonPrefix(String[] strs) {

        String tempPrefix = "";
        String strOne = strs[0];
        boolean blnFlag = false;
        List<String> output = new LinkedList<>();

        for ( int j=1; j<=strOne.length(); j++){
            if (strs.length>1) {
                for (int i = 1; i <= strs.length; i++) {
                    tempPrefix = strOne.substring(0, j);
                    if (strs[i].startsWith(tempPrefix)) {
                        blnFlag = true;
                    } else {
                        blnFlag = false;
                        break;
                    }
                }
                if (blnFlag) {
                    output.add(tempPrefix);
                } else {
                    break;
                }
            }else{
                return strOne;
            }
        }
        if (output.isEmpty()){
            return "";
        }else{
            return output.get(output.size()-1);
        }
    }
}
