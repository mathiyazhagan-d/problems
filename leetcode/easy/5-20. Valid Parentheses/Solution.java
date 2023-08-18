/*
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

        An input string is valid if:

        Open brackets must be closed by the same type of brackets.
        Open brackets must be closed in the correct order.
        Every close bracket has a corresponding open bracket of the same type.


        Example 1:

        Input: s = "()"
        Output: true
        Example 2:

        Input: s = "()[]{}"
        Output: true
        Example 3:

        Input: s = "(]"
        Output: false
*/


import java.util.Stack;

public class Solution {
    public boolean check(String s){
        Stack<Character> st = new Stack<>();

        for(char str : s.toCharArray()){
            if(str=='(')
                st.push(')');
            else if(str=='[')
                st.push(']');
            else if(str=='{')
                st.push('}');
            else if(st.isEmpty()||st.pop()!=str)
                return false;
        }
        return st.isEmpty();

//        int num = 0;
//
//        for(int i=0;i<s.length();i++) {
//            switch (s.charAt(i)){
//                case '('->num++;
//                case '['->num+=2;
//                case '{'->num+=3;
//                case ')'->num--;
//                case ']'->num-=2;
//                case '}'->num-=3;
//            }
//        }
//        if(num==0)
//        return true;
//        else
//            return false;

    }
    public static void main(String[] args) {
String s = "([)]";
Solution sol=new Solution();
boolean ans=sol.check(s);
        System.out.println(ans);
    }
}
