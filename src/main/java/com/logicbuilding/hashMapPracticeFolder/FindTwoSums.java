/*
This problem find the index positions of two numbers which equals to targeted sum of two numbers
present at that indices
 */
package com.logicbuilding.hashMapPracticeFolder;

import java.util.Arrays;
import java.util.HashMap;

public class FindTwoSums {
    @SuppressWarnings("unused")
    public static void main(String[] args){
        int[] nums = {2,7,13,11,5};
        int target = 9;
        int[] results = printIndicesOfTwoSums(nums,target);
        System.out.println(Arrays.toString(results));
    }

    private static int[] printIndicesOfTwoSums(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<nums.length;i++){
            int sum = target - nums[i];
            if(map.containsKey(sum)){
                return new int[]{map.get(sum),i};//get the index of the sum
            }
            map.put(nums[i],i);// put those indices in map
        }

       return new int[]{-1,-1};//to avoid returning null values if targeted sum is not found and null pointer exception
    }
}
