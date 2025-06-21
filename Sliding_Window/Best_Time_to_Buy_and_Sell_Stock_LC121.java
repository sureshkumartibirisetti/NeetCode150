package Sliding_Window;
/*
121. Best Time to Buy and Sell Stock
Example 1:
Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
Example 2:
Input: prices = [7,6,4,3,1]
Output: 0
Explanation: In this case, no transactions are done and the max profit = 0.
 */
public class Best_Time_to_Buy_and_Sell_Stock_LC121 {
    public static void main(String[] args) {
        int[] prices={7,6,4,3,1};
        int min=Integer.MAX_VALUE;
        int p=0;
        for(int i=0;i<prices.length;i++){
            if(min>prices[i]){
                min=prices[i];
            }else if(p<prices[i]-min){
                p=prices[i]-min;
            }
        }
        System.out.println(p);
    }
}
/*
//brute Force
int max=0;
for(int i=0;i<prices.length-1;i++){
    for(int j=i+1;j<prices.length;j++){
        if(max<(prices[j]-prices[i])){
            max=prices[j]-prices[i];
        }
    }
}
System.out.println(max);
 */

