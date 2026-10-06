package com.logicbuilding;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicateUsingStringBuilder {
    @SuppressWarnings("unused")
    public static void main(String[] args){
        String str = "abbcgcdeefhhhh";
        String words = " This is is a duplicate word word";

        removeDuplicateUsingLinkedHashSet(str);//will not print in sorted order
        removeDuplicateUsingTreeHashSet(str);//will print in sorted order
        usingForLoopToRemoveDuplicates(str);
        removeDuplicateFromASentence(words);
    }

    private static void removeDuplicateFromASentence(String words) {
        String[] str = words.split(" ");
        Set<String> set = new LinkedHashSet<>();
        StringBuilder sb = new StringBuilder();
        for(String s: str){
           set.add(s);
        }
        for(String s:set){
            sb.append(s);
        }
        System.out.println(sb);
    }

    private static void usingForLoopToRemoveDuplicates(String str) {
        char[] arr = str.toCharArray();
        Arrays.sort(arr);

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            if (i == 0 || arr[i] != arr[i - 1]) {
                sb.append(arr[i]);
            }
        }
        System.out.println(sb.toString());
    }

    private static void removeDuplicateUsingLinkedHashSet(String str) {
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        StringBuilder sb = new StringBuilder();
        char[] strArray = str.toCharArray();
        for(char c: strArray){
            if(set.add(c)){
                sb.append(c);
            }
        }
        System.out.println(sb);
    }

    private static void removeDuplicateUsingTreeHashSet(String str) {
        TreeSet<Character> set = new TreeSet<>();
        StringBuilder sb = new StringBuilder();
        char[] strArray = str.toCharArray();
        for(char c: strArray){
            set.add(c);
        }
        for(char c: set){
            sb.append(c);
        }
        System.out.println(sb);
    }
}
