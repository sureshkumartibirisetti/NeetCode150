package Arrays_and_Hashing;

import java.util.Arrays;

/*
242. Valid Anagram
Given two strings s and t, return true if t is an anagram of s, and false otherwise.
Example 1:
Input: s = "anagram", t = "nagaram"
Output: true
Example 2:
Input: s = "rat", t = "car"
Output: false
 */
public class Valid_Anagram_LC242 {
    public static void main(String[] args) {
        String s="anagram";
        String t="nagaram";
        if(s.length()!=t.length()){
            System.out.println(false);
        }
        int[] arr=new int[26];
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']++;
            arr[t.charAt(i)-'a']--;
        }
        for(int i:arr){
            if(i!=0){
                System.out.println(false);
            }
        }
        System.out.println(true);


    }
}

/**
 *Using Sorting:-
 * ---------------------------------------------------------------
 *
 *         String s="anagram";
 *         String t="nagaram";
 *         String[] arr=s.split("");
 *         String[] arr1=t.split("");
 *         Arrays.sort(arr);
 *         Arrays.sort(arr1);
 *         int c=0;
 *         if(arr.length != arr1.length){
 *             System.out.println(false);
 *         }else{
 *             for(int i=0;i<arr.length;i++){
 *                 if(arr[i].equals(arr1[i])){
 *                     c++;
 *                 }
 *             }
 *             if(c==arr.length){
 *                 System.out.println(true);
 *             }
 *             System.out.println(false);
 *
 * using Array(Best)  time Complexity(O(n+m)) space complexity(O(1)):-
 * ----------------------------------------------------------------------
 *         String s="anagram";
 *         String t="nagaram";
 *         if(s.length()!=t.length()){
 *             System.out.println(false);
 *         }
 *         int[] arr=new int[26];
 *         for(int i=0;i<s.length();i++){
 *             arr[s.charAt(i)-'a']++;
 *             arr[t.charAt(i)-'a']--;
 *         }
 *         for(int i:arr){
 *             if(i!=0){
 *                 System.out.println(false);
 *             }
 *         }
 *         System.out.println(true);
 */
