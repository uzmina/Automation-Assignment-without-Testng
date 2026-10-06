package com.logicbuilding;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateNumbersUsingLinkedHashSet {
    @SuppressWarnings("unused")
    public static void main(String[] args){
        int[] a = {60,30,10,20,30,20,40,40,50,10,45};
        Set<Integer> dataSet = new LinkedHashSet<>();
        for(int d: a){
            dataSet.add(d);
        }
        System.out.println(dataSet);

     int[] results =   dataSet.stream().mapToInt(Integer::intValue).toArray();
     System.out.println(Arrays.toString(results));


     String str ="ahabbcchlgdddeeffgff";
     removeDuplicateCharactersFromString(str);
     String str1="This duplicate is to to test duplicate string is string test";
     removeDuplicateWordsFromAString(str1);
    }

    private static void removeDuplicateWordsFromAString(String str1) {
        String[] strArray = str1.split(" ");
        Set<String> dataset = new LinkedHashSet<>();
        for(String words: strArray){
            dataset.add(words);
        }
        System.out.println(dataset);
    }

    private static void removeDuplicateCharactersFromString(String str) {
        char[] strArray = str.toCharArray();
        Set<Character> dataset = new LinkedHashSet<>();
        for(char d:strArray){
            dataset.add(d);
        }
        System.out.println(dataset);
    }
}
