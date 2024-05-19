import TwoPointers.TwoSum2InputArrayIsSorted.Solution;

import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] test1 = {2,7,11,15};
        int[] test2 = {2,3,4};
        int[] result = solution.twoSum(test1, 9);
        int[] result2 = solution.twoSum(test2, 6);
        System.out.println(Arrays.toString(result));
        System.out.println(Arrays.toString(result2));

    }
}
