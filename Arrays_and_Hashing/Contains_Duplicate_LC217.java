package Arrays_and_Hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/*
//https://youtu.be/T0u5nwSA0w0?feature=shared
217. Contains Duplicate
Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
Example 1:
Input: nums = [1,2,3,1]
Output: true
Explanation:
The element 1 occurs at the indices 0 and 3.
Example 2:
Input: nums = [1,2,3,4]
Output: false
Explanation;
All elements are distinct.
Example 3:
Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true
 */
public class Contains_Duplicate_LC217 {
    public static void main(String[] args) {
        int[] nums={1,2,3,1};
        HashSet<Integer> set=new HashSet<>();
        for(int i:nums){
            if(set.contains(i)){
                System.out.println(true);
            }
            set.add(i);
        }
        System.out.println(false);

    }
}
/**
 * Using HashMap:-
 * -----------------------------------------------------------------
 *         HashMap<Integer,Integer> map=new HashMap<>();
 *         for(int i:nums){
 *             map.put(i,map.getOrDefault(i,0)+1);
 *         }
 *         for(int i: map.values()){
 *             if(i>1){
 *                 System.out.println(true);
 *             }
 *         }
 *         System.out.println(false);
 *
 * Using HashSet:-
 * ----------------------------------------------------------------------
 *         int[] nums={1,2,3,1};
 *         int a=nums.length;
 *         HashSet<Integer> set=new HashSet<>();
 *         for(int i:nums){
 *             set.add(i);
 *         }
 *         System.out.println(a==set.size());
 *
 * Using Sorting :-
 * -----------------------------------------------------------------------
 *         Arrays.sort(nums);
 *         for(int i=1;i<nums.length;i++){
 *             if(nums[i-1]==nums[i]){
 *                 System.out.println(true);
 *                 break;
 *             }
 *         }
 *         System.out.println(false);
 *
 *Using HashSet(Best Approach)   Time complexity(O(n)):-
 * -------------------------------------------------------------------------
 *         int[] nums={1,2,3,1};
 *         HashSet<Integer> set=new HashSet<>();
 *         for(int i:nums){
 *             if(set.contains(i)){
 *                 System.out.println(true);
 *             }
 *             set.add(i);
 *         }
 *         System.out.println(false);
 */
