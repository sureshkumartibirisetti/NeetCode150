package Two_Pointers;
/*
11. Container With Most Water
Example 1:


Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49
Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.
Example 2:

Input: height = [1,1]
Output: 1
 */
public class Container_with_Most_Water_LC11 {
    public static void main(String[] args) {
        int[] height={1,8,6,2,5,4,8,3,7};
        int maxHeight=0;
        int i=0;
        int j=height.length-1;
        while(i<j){
            int sum=Math.min(height[i],height[j]);
            int area=(j-i)*(sum);
            if(maxHeight<area){
                maxHeight=area;
            }
            if (height[i] < height[j]) {
                i++;
            }else{
                j--;
            }
        }
        System.out.println(maxHeight);
    }
}
/*
int[] height={1,1};
int maxHeight=0;
for(int i=0;i<height.length;i++){
    for(int j=i+1;j<height.length;j++){
        int a=Math.min(height[i],height[j]);
        int b=j-i;
        maxHeight=Math.max(maxHeight,(a*b));
    }
}
System.out.println(maxHeight);
 */
