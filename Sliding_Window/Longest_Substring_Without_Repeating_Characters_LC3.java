package Sliding_Window;

import java.util.HashSet;

/*
3. Longest Substring Without Repeating Characters
Example 1:
Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:
Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:
Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */
public class Longest_Substring_Without_Repeating_Characters_LC3 {
    public static void main(String[] args) {
        String s="abced";
        if(s.length()==0||s==null){
            System.out.println("0");
        }if(s.length()==1){
            System.out.println("1");
        }
        int l=0;
        int r=0;
        int res=0;
        HashSet<Character> set=new HashSet<>();
        while(r<s.length()){
            char c=s.charAt(r);
            while(set.contains(c)){
                set.remove(s.charAt(l));
                l++;
            }
            set.add(c);
            res=Math.max(res,r-l+1);
            r++;
        }
        System.out.println(res);
    }
}
