package Two_Pointers;

import java.util.Arrays;

/*
42. Trapping Rain Water
Example 1:
Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
Output: 6
Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped.
Example 2:
Input: height = [4,2,0,3,2,5]
Output: 9
 */
public class Trapping_Rain_Water_LC42 {
    public static void main(String[] args) {
        int[] height={0,1,0,2,1,0,1,3,2,1,2,1};
        int left=0;
        int right= height.length-1;
        int total=0;
        int leftMax=height[0];
        int rightMax=height[right];
        while(left<right){
            if(height[left]<height[right]){
                leftMax=Math.max(leftMax,height[left]);
                if(leftMax-height[left]>0){
                    total=total+leftMax-height[left];
                }
                left++;
            }else{
                rightMax=Math.max(rightMax,height[right]);
                if(rightMax-height[right]>0){
                    total=total+rightMax-height[right];
                }
                right--;
            }
        }
        System.out.println(total);

    }
}
/*
int[] leftMax=new int[height.length];
int[] rightMax=new int[height.length];
int leftMax1=0;
int rightMax1=0;
for(int i=0;i< height.length;i++){
    if(height[i]>leftMax1){
        leftMax1= height[i];
    }
    leftMax[i]=leftMax1;
}
for(int i= height.length-1;i>=0;i--){
    if(height[i]>rightMax1){
        rightMax1=height[i];
    }
    rightMax[i]=rightMax1;
}
for(int i=1;i< height.length-1;i++){

        int res1 = Math.min(leftMax[i - 1], rightMax[i + 1])-height[i];
        if (res1 > 0) {
            res += res1;
        }
}
System.out.println(res);
 */
