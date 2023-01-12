package com.gitflowin.solutions.arrays_and_hashing;

import java.util.HashSet;

/*
 * 217. Contains Duplicate
 *
 * https://leetcode.com/problems/contains-duplicate/
 *
 * Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
 *
 * Example 1:
 * ----------
 * Input: nums = [1,2,3,1]
 * Output: true
 */
public class ContainsDuplicate {
  public static boolean containsDuplicate(int[] nums) {
    if (nums.length < 2) {
      return false;
    }

    HashSet<Integer> set = new HashSet<>();

    for (int i = 0; i < nums.length; i++) {
      if(!set.add(nums[i])) {
        return true;
      }
    }

    return false;
  }
}
