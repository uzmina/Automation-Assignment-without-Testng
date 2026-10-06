package com.logicbuilding;

import java.util.HashMap;
import java.util.Map;

public class CountFrequencyOfAWordOrCharacters {
    @SuppressWarnings("unused")
    public static void main(String[] args){
        String str = "Hello";
        countFrequencyOfChars(str);
        String input = "This is a test for counting frequency of how how many times a  word appears word";
        countFrequencyOfWords(input);

    }

    private static void countFrequencyOfWords(String input) {
        String[] stringInput = input.split(" ");
        HashMap<String, Integer> results = new HashMap<>();
        for(String str: stringInput){
            /*add into hashmap by using put
            first parameter is str used for iteration
            second is results which contains str and second parameter 0 if no more string(words)
            and +1 for increment if there is one more
             */
            results.put(str, results.getOrDefault(str,0)+1);
        }
        for(Map.Entry<String,Integer> entry: results.entrySet()){
            System.out.println(entry.getKey()+ " "+ entry.getValue());
        }
    }

    private static void countFrequencyOfChars(String str){
        char[] dataArray = str.toCharArray();
        HashMap<Character,Integer> results = new HashMap<>();
        for(char c: dataArray){
            results.put(c, results.getOrDefault(c,0)+1);
        }
        for(Map.Entry<Character,Integer> entry: results.entrySet()){
            System.out.println(entry.getKey() + "  "+ entry.getValue());
        }
    }
}
