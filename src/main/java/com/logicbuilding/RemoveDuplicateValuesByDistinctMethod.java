package com.logicbuilding;

import java.util.Arrays;

public class RemoveDuplicateValuesByDistinctMethod{
    @SuppressWarnings("unused")
    public static void main(String[] args){
        int[] a = {60,30,10,20,30,20,40,40,50,10,45};
        String str = "This is a a string string";
        removeDuplicateNumbers(a);
    }
    private static void removeDuplicateNumbers(int[] a) {
        int[] results = Arrays.stream(a).distinct().toArray();
        System.out.println(Arrays.toString(results));
    }
}
