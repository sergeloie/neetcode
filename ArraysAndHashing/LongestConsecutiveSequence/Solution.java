//https://leetcode.com/problems/longest-consecutive-sequence/description/

/*
128. Longest Consecutive Sequence

Medium

Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.

You must write an algorithm that runs in O(n) time.



Example 1:

Input: nums = [100,4,200,1,3,2]
Output: 4
Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore, its length is 4.

Example 2:

Input: nums = [0,3,7,2,5,8,4,6,0,1]
Output: 9
*/

//https://leetcode.com/problems/longest-consecutive-sequence/submissions/1261546743/
package ArraysAndHashing.LongestConsecutiveSequence;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        Set<Integer> set = new TreeSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int sizeMax = 0;
        int count = 1;

        Iterator<Integer> iterator = set.iterator();
        int begin = iterator.next();

        while (iterator.hasNext()) {
            int current = iterator.next();
            if (begin + 1 == current) {
                count++;
            } else {
                sizeMax = Math.max(sizeMax, count);
                count = 1;
            }
            begin = current;
        }
        return Math.max(sizeMax, count);
    }
}
