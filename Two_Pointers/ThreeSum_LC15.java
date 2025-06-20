package Two_Pointers;

import java.util.*;

/*
15. 3Sum
Example 1:
Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]
Explanation:
nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
The distinct triplets are [-1,0,1] and [-1,-1,2].
Notice that the order of the output and the order of the triplets does not matter.
Example 2:
Input: nums = [0,1,1]
Output: []
Explanation: The only possible triplet does not sum up to 0.
Example 3:
Input: nums = [0,0,0]
Output: [[0,0,0]]
Explanation: The only possible triplet sums up to 0.
 */
public class ThreeSum_LC15 {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> list=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i< nums.length && nums[i]<=0;i++){
            twoSum(nums,i,list);
        }
        System.out.println(list);

    }
    public static void twoSum(int[] nums,int a,List<List<Integer>> list){
        int l=a+1;
        int r=nums.length-1;
        while(l<r){
            int temp=nums[a]+nums[l]+nums[r];
            if(temp<0){
                l++;
            }else if(temp>0){
                r--;
            }else{
                list.add(Arrays.asList(nums[a],nums[l++],nums[r--]));
                while(l<r && nums[l]!=nums[l-1]){
                    ++l;
                }
            }

        }
    }


}
/*
public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums); //-4,-1,-1,0,1,2
        List<List<Integer>> list=new ArrayList<>();
        for(int i=0;i< nums.length && nums[i]<=0;i++){
            if(i==0 || nums[i]!=nums[i-1]){
                twoSum2(nums,i,list);
            }
        }
        return list;
    }
    public static void twoSum2(int[] nums,int i,List<List<Integer>> res){
        int l=i+1;
        int r=nums.length-1;
        while(l<r){
            int sum=nums[i]+nums[l]+nums[r];
            if(sum<0){
                l++;
            }else if(sum>0){
                r--;
            }else{
                res.add(Arrays.asList(nums[i],nums[l++],nums[r--]));
                while(l<r && nums[l]==nums[l-1]){
                    ++l;
                }
            }
        }
    }
 */