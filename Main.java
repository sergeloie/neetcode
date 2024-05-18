import ArraysAndHashing.LongestConsecutiveSequence.Solution;

import java.util.List;


public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums1 = {100,4,200,1,3,2};
        int[] nums2 = {0,3,7,2,5,8,4,6,0,1};
        int[] nums3 = {};
//        System.out.println(solution.longestConsecutive(nums1));
        System.out.println(solution.longestConsecutive(nums2));
        System.out.println(solution.longestConsecutive(nums3));
    }
}
