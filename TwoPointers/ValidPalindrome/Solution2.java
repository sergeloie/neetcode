/*

https://leetcode.com/problems/valid-palindrome/description/

* 125. Valid Palindrome

Easy

A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.



Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.

Example 2:

Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.

Example 3:

Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.

https://leetcode.com/problems/valid-palindrome/submissions/1261999399/

 */

package TwoPointers.ValidPalindrome;

public class Solution2 {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        int end = right;
        while (left < right) {
            while (left <= end && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            while (right >= 0 && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }
            if (left < s.length() - 1 && right >= 0) {

                if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                    return false;
                }
            }
            left++;
            right--;
        }
        return true;
    }
}