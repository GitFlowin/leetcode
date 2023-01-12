package com.gitflowin;

import com.gitflowin.solutions.TopKFrequentElements;
import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
    int[] nums = new int[]{1,1,1,2,2,3,4,4,4,4};

    System.out.println(Arrays.toString(TopKFrequentElements.topKFrequent(nums, 2)));
  }
}
