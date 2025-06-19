package Arrays_and_Hashing;

import java.util.*;
import java.util.HashMap;
import java.util.TreeMap;

/*
347. Top K Frequent Elements
Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.
Example 1:
Input: nums = [1,1,1,2,2,3], k = 2
Output: [1,2]
Example 2:
Input: nums = [1], k = 1
Output: [1]
 */
public class Top_K_Frequent_Elements_LC347 {
    public static void main(String[] args) {
        int[] nums={4,1,-1,2,-1,2,3};
        int k=2;
        int[] res=new int[k];
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        Queue<Integer> queue=new PriorityQueue<>((a,b)-> map.get(a)-map.get(b));
        for(int i:map.keySet()){
            queue.add(i);
            if(queue.size()>k){
                queue.poll();
            }
        }
        int[] ans=new int[k];
        for(int i=0;i<k;i++){
            ans[i]=queue.poll();
        }
        System.out.println(Arrays.toString(ans));
    }
}

/**
 * using map entry
 *         int[] nums={4,1,-1,2,-1,2,3};
 *         int k=2;
 *         int[] res=new int[k];
 *         HashMap<Integer,Integer> map=new HashMap<>();
 *         for(int i:nums){
 *             map.put(i,map.getOrDefault(i,0)+1);
 *         }
 *         System.out.println(map);
 *         ArrayList<Map.Entry<Integer, Integer>> sortedEntries = new ArrayList<>(map.entrySet());
 *         sortedEntries.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
 *         System.out.println(sortedEntries);
 *         int i=0;
 *         for (Map.Entry<Integer, Integer> entry : sortedEntries) {
 *             if(i>=k){
 *                 break;
 *             }
 *             res[i]= entry.getKey();
 *             i++;
 *         }
 *         System.out.println(Arrays.toString(res));
 */
