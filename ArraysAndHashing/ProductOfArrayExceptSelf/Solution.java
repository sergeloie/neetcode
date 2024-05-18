package ArraysAndHashing.ProductOfArrayExceptSelf;
//https://leetcode.com/problems/product-of-array-except-self/description/


/*
238. Product of Array Except Self
Medium

Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

You must write an algorithm that runs in O(n) time and without using the division operation.



Example 1:

Input: nums = [1,2,3,4]
Output: [24,12,8,6]

Example 2:

Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]
*/


//https://leetcode.com/problems/product-of-array-except-self/post-solution/?submissionId=1226073407
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int length = nums.length;
        int[] result = new int[length];
        int[] leftProd = new int[length + 2];
        int[] rightProd = new int[length + 2];
        int lastIndex = length + 1;
        leftProd[0] = 1;
        leftProd[1] = 1;
        rightProd[lastIndex] = 1;
        rightProd[lastIndex - 1] = 1;


        for (int i = 2; i <= lastIndex; i++) {
            leftProd[i] = nums[i - 2] * leftProd[i - 1];
            rightProd[lastIndex - i] = nums[lastIndex - i] * rightProd[lastIndex + 1 - i];
        }

        for (int i = 0; i < result.length; i++) {
            result[i] = leftProd[i + 1] * rightProd[i + 1];
        }

        return result;
    }
}

