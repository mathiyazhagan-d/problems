/*
Write a function to find the longest common prefix string amongst an array of strings.

        If there is no common prefix, return an empty string "".



        Example 1:

        Input: strs = ["flower","flow","flight"]
        Output: "fl"
        Example 2:

        Input: strs = ["dog","racecar","car"]
        Output: ""
        Explanation: There is no common prefix among the input strings.

*/

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder ans = new StringBuilder();
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length-1];
        for (int i=0; i<Math.min(first.length(), last.length()); i++) {
            if (first.charAt(i) != last.charAt(i)) {
                return ans.toString();
            }
            ans.append(first.charAt(i));
        }
        return ans.toString();

//        ArrayList<String> ans = new ArrayList<>(Arrays.asList(strs[0].split("")));
//
//        for (String s : strs) {
//            String[] ss = s.split("");
//            ArrayList<String> temp = new ArrayList<>(ans);
//            ans.clear();
//
//            for (int i = 0; i < ss.length && i < temp.size(); i++) {
//                if (ss[i].equals(temp.get(i))) {
//                    ans.add(ss[i]);
//                } else {
//                    break;
//                }
//            }
//        }
//
//        if (ans.isEmpty()) {
//            return "";
//        } else {
//            return String.join("", ans);
//        }
    }
    public static void main(String[] args) {
        Solution sol=new Solution();
        String[] str= {"flower","flow","flight"};
        String ans=sol.longestCommonPrefix(str);
        System.out.println(ans);
    }
}
