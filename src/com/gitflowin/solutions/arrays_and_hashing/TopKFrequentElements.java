package com.gitflowin.solutions.arrays_and_hashing;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/*
 * 347. Top K Frequent Elements
 *
 * https://leetcode.com/problems/top-k-frequent-elements/
 *
 * Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.
 *
 * Example 1:
 * ----------
 * Input: nums = [1,1,1,2,2,3], k = 2
 * Output: [1,2]
 *
 */
public class TopKFrequentElements {

  public static int[] topKFrequent(int[] nums, int k) {
    List<Integer> answer = new ArrayList<>();
    /*
     * Key - Integer itself
     * Value - Occurance of that integer (must be at least 1)
     */
    Map<Integer, Integer> numsMap = new HashMap<>();

    for (int i = 0; i < nums.length; i++) {
      numsMap.put(nums[i], numsMap.getOrDefault(nums[i], 0) + 1);
    }

    LinkedHashMap<Integer, Integer> orderedMap = new LinkedHashMap<>();

    numsMap.entrySet()
        .stream()
        .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
        .forEachOrdered(x -> orderedMap.put(x.getKey(), x.getValue()));

    System.out.println(orderedMap);
    int counter = 0;
    for (Map.Entry<Integer, Integer> entry : orderedMap.entrySet()) {

      if (counter < k) {
        answer.add(entry.getKey());
        counter++;
      }
    }

    return listToArray(answer);
  }

  private static int[] listToArray(List<Integer> list) {
    int[] num = new int[list.size()];
    for (int i = 0; i < list.size(); i++) {
      num[i] = list.get(i);
    }

    return num;
  }
}
