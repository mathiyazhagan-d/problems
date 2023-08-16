/*Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

        Symbol       Value
        I             1
        V             5
        X             10
        L             50
        C             100
        D             500
        M             1000
        For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

        Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

        I can be placed before V (5) and X (10) to make 4 and 9.
        X can be placed before L (50) and C (100) to make 40 and 90.
        C can be placed before D (500) and M (1000) to make 400 and 900.
        Given a roman numeral, convert it to an integer.



        Example 1:

        Input: s = "III"
        Output: 3
        Explanation: III = 3.
        Example 2:

        Input: s = "LVIII"
        Output: 58
        Explanation: L = 50, V= 5, III = 3.
*/

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int romanToInt(String s) {
//        int answer = 0, number = 0, prev = 0;
//
//        for (int j = s.length() - 1; j >= 0; j--) {
//            switch (s.charAt(j)) {
//                case 'M' -> number = 1000;
//                case 'D' -> number = 500;
//                case 'C' -> number = 100;
//                case 'L' -> number = 50;
//                case 'X' -> number = 10;
//                case 'V' -> number = 5;
//                case 'I' -> number = 1;
//            }
//            if (number < prev) {
//                answer -= number;
//            }
//            else {
//                answer += number;
//            }
//            prev = number;
//        }
//        return answer;





Map<String,Integer> romanToNumber= new HashMap<>();
        romanToNumber.put("I",1);
        romanToNumber.put("V",5);
        romanToNumber.put("X",10);
        romanToNumber.put("L",50);
        romanToNumber.put("C",100);
        romanToNumber.put("D",500);
        romanToNumber.put("M",1000);

        int answer=0;
        String[] str = s.split("");
        int prevValue = 0;
        for (String st : str) {
            int value = romanToNumber.get(st);
            if (value <= prevValue) {
                answer += value;
            } else {
                answer += (value - 2 * prevValue);
            }
            prevValue = value;
        }
        return answer;
    }

    public static void main(String[] args) {
       Solution solve=new Solution();
      int answer= solve.romanToInt("IDM");
        System.out.println(answer);
    }
}
