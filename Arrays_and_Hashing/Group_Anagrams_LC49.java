package Arrays_and_Hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/*
49. Group Anagrams
Given an array of strings strs, group the anagrams together. You can return the answer in any order.
Example 1:
Input: strs = ["eat","tea","tan","ate","nat","bat"]
Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
Explanation:
There is no string in strs that can be rearranged to form "bat".
The strings "nat" and "tan" are anagrams as they can be rearranged to form each other.
The strings "ate", "eat", and "tea" are anagrams as they can be rearranged to form each other.
Example 2:
Input: strs = [""]
Output: [[""]]
Example 3:
Input: strs = ["a"]
Output: [["a"]]
 */
public class Group_Anagrams_LC49 {
    public static void main(String[] args) {
        String[] strs={"bdddddddddd","bbbbbbbbbbc"};
        if(strs.length==0){
            System.out.println(new ArrayList());
        }
        HashMap<String,List> map=new HashMap<>();
        List<List> res=new ArrayList<>();
        for(int i=0;i<strs.length;i++){
            int[] arr=new int[26];
            for(int j=0;j<strs[i].length();j++){
                int temp=strs[i].charAt(j)-'a';
                arr[temp]++;
            }
            StringBuilder sb=new StringBuilder();
            for(int k:arr){
                sb.append("#");
                sb.append(k);
            }
            String s1=sb.toString();
            if(!map.containsKey(s1)){
                map.put(s1,new ArrayList<>());
            }
            map.get(s1).add(strs[i]);

        }
        for(List i:map.values()){
            res.add(i);
        }
        System.out.println(res);


//        System.out.println(Arrays.toString(arr));
    }
}
/**
 *
 * Using Sorting (O(n^3)):-
 * ---------------------------------------------------
 *         List<List<String>> res=new ArrayList<>();
 *         String[] strs1=new String[strs.length];
 *         for(int i=0;i<strs.length;i++){
 *             String[] s=strs[i].split("");
 *             Arrays.sort(s);
 *             String temp=String.join("",s);
 *             strs1[i]=temp;
 *         }
 *         Arrays.sort(strs1);
 *         System.out.println(Arrays.toString(strs1));
 *
 * Usinh Hashmap(Best)(O(n*K)):-
 * ------------------------------------------------
 */
