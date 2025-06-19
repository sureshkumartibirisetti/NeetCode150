package Two_Pointers;

import java.util.Arrays;

/*
167. Two Sum II - Input Array Is Sorted
Example 1:
Input: numbers = [2,7,11,15], target = 9
Output: [1,2]
Explanation: The sum of 2 and 7 is 9. Therefore, index1 = 1, index2 = 2. We return [1, 2].
Example 2:
Input: numbers = [2,3,4], target = 6
Output: [1,3]
Explanation: The sum of 2 and 4 is 6. Therefore index1 = 1, index2 = 3. We return [1, 3].
Example 3:
Input: numbers = [-1,0], target = -1
Output: [1,2]
Explanation: The sum of -1 and 0 is -1. Therefore index1 = 1, index2 = 2. We return [1, 2].
 */
public class Two_Sum_II_Input_Array_Is_Sorted_LC167 {
    public static void main(String[] args) {
        int[] numbers={2,7,11,15};
        int target=9;
        int[] res={0,0};
        int i=0;
        int j= numbers.length-1;
        while(i<=j){
            int tempSum=numbers[i]+numbers[j];
            if(tempSum==target){
                res[0]=i+1;
                res[1]=j+1;
                break;
            }
            else if(target<tempSum){
                j--;
            }else{
                i++;
            }
        }
        System.out.println(Arrays.toString(res));
    }
}
