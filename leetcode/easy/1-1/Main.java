import org.w3c.dom.ls.LSOutput;
/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

        You may assume that each input would have exactly one solution, and you may not use the same element twice.

        You can return the answer in any order.



        Example 1:

        Input: nums = [2,7,11,15], target = 9
        Output: [0,1]
        Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        int[] num = {2, 7, 11, 15};
        int target = 9;
        Solution sol = new Solution();
        int[] answer = sol.twoSum(num, target);
        ArrayList<Integer> ans = new ArrayList<>();
        for (int a : answer) {
            ans.add(a);
        }
        System.out.println(ans);
    }
}

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int check = target - nums[i];
            if (numMap.containsKey(check)) {
                return new int[]{numMap.get(check), i};
            }
            numMap.put(nums[i], i);
        }
        return null;
    }
}