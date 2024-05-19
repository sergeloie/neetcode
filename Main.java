import TwoPointers.ValidPalindrome.Solution2;

import java.util.List;


public class Main {
    public static void main(String[] args) {
        Solution2 solution = new Solution2();
        String test = "A man, a plan, a canal: Panama";
        String test2 = "race a car";
        String test3 = "0P";
        String test4 = ".,";
        boolean result = solution.isPalindrome(test);
        boolean result2 = solution.isPalindrome(test2);
        boolean result3 = solution.isPalindrome(test3);
        boolean result4 = solution.isPalindrome(test4);
        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);

    }
}
