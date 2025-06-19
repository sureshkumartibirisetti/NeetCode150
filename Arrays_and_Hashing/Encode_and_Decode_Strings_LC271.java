package Arrays_and_Hashing;
import java.util.*;
/*
Encode and Decode Strings

Design an algorithm to encode a list of strings to a single string. The encoded string is then decoded back to the original list of strings.
Please implement encode and decode
Example 1:
Input: ["neet","code","love","you"]
Output:["neet","code","love","you"]
Example 2:
Input: ["we","say",":","yes"]
Output: ["we","say",":","yes"]
Constraints:
0 <= strs.length < 100
0 <= strs[i].length < 200
strs[i] contains only UTF-8 characters.
 */
public class Encode_and_Decode_Strings_LC271 {
    public static String encode(List<String> strs) {
        if(strs.size()==0){
            return Character.toString((char)258);
        }
        String s1=Character.toString((char)257);
        StringBuilder sb=new StringBuilder();
        for(String s:strs){
            sb.append(s);
            sb.append(s1);
        }
        sb.deleteCharAt(sb.length()-1);
        System.out.println(sb.toString());
        return sb.toString();
    }

    public static List<String> decode(String str) {
        List<String> list=new ArrayList<>();
        if(str.equals(Character.toString((char)258))){
            return new ArrayList();
        }
        String s1=Character.toString((char)257);
        String[] arr=str.split(s1);
        for(String i:arr){
            list.add(i);
        }
        return list;


    }
    public static void main(String[] args) {
        List<String> list=Arrays.asList("neet","code","love","you");
        String encoded=encode(list);
        System.out.println(decode(encoded));


    }
}
