package ArraysAndHashing.EncodeAndDecodeStrings;

//https://neetcode.io/problems/string-encode-and-decode

/*
String Encode and Decode

Design an algorithm to encode a list of strings to a single string. The encoded string is then decoded back to the original list of strings.

Please implement encode and decode

Example 1:

Input: ["neet","code","love","you"]

Output:["neet","code","love","you"]

Example 2:

Input: ["we","say",":","yes"]

Output: ["we","say",":","yes"]
*/


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public String encode(List<String> strs) {
        if (strs.isEmpty()) {
            return "[]";
        }
        StringBuilder strinbuilder = new StringBuilder("[");
        for (String string : strs) {
            strinbuilder.append("\"");
            strinbuilder.append(string);
            strinbuilder.append("\",");
        }
        strinbuilder.deleteCharAt(strinbuilder.length() - 1);
        strinbuilder.append("]");
        return strinbuilder.toString();
    }

    public List<String> decode(String str) {
        if (str.equals("[]")) {
            return new ArrayList<>();
        }

        List<String> result;
        result = Arrays.asList(str.split("\",\""));

        String first = result.get(0);
        first = first.substring(2);
        result.set(0, first);

        String last = result.get(result.size() - 1);
        last = last.substring(0, last.length() - 2);
        result.set(result.size() - 1, last);
        return result;
    }
}
