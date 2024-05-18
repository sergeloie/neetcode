//https://leetcode.com/problems/valid-anagram
//https://leetcode.com/problems/valid-anagram/post-solution/?submissionId=1217047847

/*

242. Valid Anagram

        Given two strings s and t, return true if t is an anagram of s, and false otherwise.

        An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.



        Example 1:

        Input: s = "anagram", t = "nagaram"
        Output: true

        Example 2:

        Input: s = "rat", t = "car"
        Output: false

*/

import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> sMap = new HashMap<>();
        Map<Character, Integer> tMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char si = s.charAt(i);
            char ti = t.charAt(i);
            sMap.computeIfPresent(si, (key, value) -> value + 1);
            tMap.computeIfPresent(ti, (key, value) -> value + 1);
            sMap.putIfAbsent(si, 1);
            tMap.putIfAbsent(ti, 1);
        }
        return sMap.equals(tMap);
    }
}


//https://leetcode.com/problems/valid-anagram/post-solution/?submissionId=1223054840
import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char si = s.charAt(i);
            char ti = t.charAt(i);
            map.compute(si, (key, value) -> value == null ? 1 : value + 1);
            map.compute(ti, (key, value) -> value == null ? -1 : value - 1);

        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() != 0) {
                return false;
            }
        }
        return true;
    }
}