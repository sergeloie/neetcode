import TwoPointers.ValidPalindrome.Solution;

import java.util.List;


public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String test = "A man, a plan, a canal: Panama";
        String test2 = "race a car";
        String test3 = "0P";
        boolean result = solution.isPalindrome(test3);
        System.out.println(result);

    }
}
