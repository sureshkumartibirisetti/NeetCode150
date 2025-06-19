package Arrays_and_Hashing;

import java.util.Arrays;

/*
238. Product of Array Except Self
Example 1:
Input: nums = [1,2,3,4]
Output: [24,12,8,6]
Example 2:
Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]
 */
public class Products_of_Array_Except_self_LC238 {
    public static void main(String[] args) {
        int[] nums={1,2,3,4};
        int[] prefix=new int[nums.length];
        prefix[0]=1;
        for(int i=1;i<nums.length;i++){
            prefix[i]=prefix[i-1]*nums[i-1];
        }
        int temp=1;
        for(int i=nums.length-2;i>=0;i--){
            temp*=nums[i+1];
            prefix[i]=prefix[i]*temp;
        }
        System.out.println(Arrays.toString(prefix));
    }

}
