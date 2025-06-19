package Arrays_and_Hashing;

import java.util.Arrays;
import java.util.HashSet;

/*
128. Longest Consecutive Sequence
Example 1:
Input: nums = [100,4,200,1,3,2]
Output: 4
Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
Example 2:
Input: nums = [0,3,7,2,5,8,4,6,0,1]
Output: 9
Example 3:
Input: nums = [1,0,1,2]
Output: 3
 */
public class Longest_Consecutive_Sequence_LC128 {
    public static void main(String[] args) {
        int[] nums={0,3,7,2,5,8,4,6,0,1};
        if(nums.length==0){
            System.out.println(0);
        }
        HashSet<Integer> set=new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        int l=1;
        for(int i:set){
            if(set.contains(i-1)){
                continue;
            }else{
                int currentNum=i;
                int currentsub=1;
                while(set.contains(currentNum+1)){
                    currentNum++;
                    currentsub++;
                }
                l=Math.max(l,currentsub);
            }
        }
        System.out.println(l);

    }

}

/**
 *         int res=0;
 *         Arrays.sort(nums);
 *         int temp=0;
 *         for(int i=0;i<nums.length-1;i++){
 *             if(nums[i]+1==nums[i+1]){
 *                   temp++;
 *                   if(temp>res){
 *                       res=temp;
 *                   }
 *             } else if (nums[i]==nums[i+1]) {
 *                 continue;
 *             } else{
 *                 temp=0;
 *             }
 *
 *         }
 *         System.out.println(res+1);
 */
