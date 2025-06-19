package Arrays_and_Hashing;

import java.util.HashMap;

/*
1. Two Sum
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.
Example 1:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:
Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:
Input: nums = [3,3], target = 6
Output: [0,1]
 */
public class Two_Sum_LC1 {
    public static void main(String[] args) {
        int[] nums={2,7,11,15};
        int target=9;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int temp=target-nums[i];
            if(map.containsKey(temp)){
                System.out.println(new int[]{map.get(temp),i});
            }else{
                map.put(nums[i],i);
            }
        }
        System.out.println(new int[]{-1,-1});

    }
}

/**
 * using For loops :-
 * --------------------------------------------------------
 *         int n = nums.length;
 *         for (int i = 0; i < n - 1; i++) {
 *             for (int j = i + 1; j < n; j++) {
 *                 if (nums[i] + nums[j] == target) {
 *                     return new int[]{i, j};
 *                 }
 *             }
 *         }
 *         return new int[]{};
 *
 *Using Sorting And binary search(O(n log n+ log n)):-
 * ------------------------------------------------------------
 *
 * Using Hashmap(best) (O(N)):-
 * ----------------------------------------------------------
 *         HashMap<Integer,Integer> map=new HashMap<>();
 *         for(int i=0;i<nums.length;i++){
 *             int temp=target-nums[i];
 *             if(map.containsKey(temp)){
 *                 System.out.println(new int[]{map.get(temp),i});
 *             }else{
 *                 map.put(nums[i],i);
 *             }
 *         }
 *         System.out.println(new int[]{-1,-1});
 *
 */
