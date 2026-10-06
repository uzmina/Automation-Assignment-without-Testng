package com.logicbuilding.hashMapPracticeFolder;

import java.util.*;

public class PracticeHashMapProblems {
    @SuppressWarnings("unused")
    public static void main(String[] args){

        String str = "programming";
        String str1 = "swiss";
        String[] words = {"apple", "banana","apple", "orange", "banana", "apple"};
        int[] numbers = {5,2,1,5,4,2,3,5};
        String[] anagram = {"eat","tan","ate","tea","bat","ant"};
        int[] nums = {2,7,11,13};

        printFrequencyOfEachWordInString(words);    //count frequency of words
        printFrequencyOfEachCharacter(str);   //Given a string, print the frequency of each character.
        findTheFirstNonRepeatedChar(str1);// print only the first non-repeated character
        countDuplicateCharacters(str);
        printFirstDuplicateCharacter(str);
        printFirstDuplicateElement(numbers);
        printFirstDuplicateWord(words);
        groupAnagrams(anagram);
        findAllDuplicateNumbers(numbers);

    }



    private static void findAllDuplicateNumbers(int[] numbers) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i : numbers){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }

        for(Map.Entry<Integer,Integer> results: hm.entrySet()){
            if(results.getValue() >=2 ) {
                System.out.println("Duplicate numbers are " + results.getKey() + " number of times repeated " + results.getValue());
            }
        }
    }

    private static void groupAnagrams(String[] anagram) {
        HashMap<String, List<String>> hm = new HashMap<>();//create a hashmap object with first parameter as string and second as a list of string
       for(String arr: anagram){//iterate string array
           char[] charArray = arr.toCharArray();//convert each element in the array to char array tea will become t,e,a
           Arrays.sort(charArray);//sort convert array so t,e,a will be sorted as a,e,t, eat will also be sorted as a,e,t
           String key = new String(charArray);// store sorted char array into keys
           hm.putIfAbsent(key,new ArrayList<>());//if the next key element in array does not match the existing then create a new array
           hm.get(key).add(arr);//get the new key and add it to the new array
       }
       System.out.println("Anamgram grouped as   "+hm.values()); //print the values added in new arraylist
    }

    private static void printFirstDuplicateWord(String[] words) {
        HashMap<String,Integer> hm = new HashMap<>();
        for(String word : words){
            if(hm.containsKey(word)){
                System.out.println("The first duplicate word is " + word);
                return;
            }
            hm.put(word,hm.getOrDefault(word,0)+1);
        }
        System.out.println("No Duplicate words");
    }

    private static void printFirstDuplicateElement(int[] elements) {
        HashSet<Integer> set = new HashSet<>();  //using hashset
        for(int i : elements){
            if(set.contains(i)){
                System.out.println("The first element is  "+ i);
                return;
            }   set.add(i);
        }      System.out.println("No duplicates in array");
        
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i : elements){
            if( hm.containsValue(i)){
                System.out.println("first duplicate element is  "+ i);
                return;
            }     hm.put(i,1);
        }       System.out.println("No duplicates");
    }

    private static void printFirstDuplicateCharacter(String str) {
        HashMap<Character, Integer> hm = new HashMap<>();
        char[] strArray = str.toCharArray();
        for(char c : strArray){
            if(hm.containsKey(c)){
                     System.out.println("The first duplicate char in the string is  "+c);
                     return;
            }   hm.put(c, hm.getOrDefault(c,0)+1);
        }
            System.out.println("no duplicate values in the string");
    }

    private static void countDuplicateCharacters(String str) {
        HashMap<Character, Integer> hm = new HashMap<>();
        for (char c : str.toCharArray()) {
            hm.put(c, hm.getOrDefault(c, 0) + 1);
        }
        for (Map.Entry<Character, Integer> results : hm.entrySet()) {
            if (results.getValue() >= 2) {
                System.out.println("The duplicate key is  "+results.getKey()+" and value is  "+results.getValue());
            }
        }
    }

    private static void findTheFirstNonRepeatedChar(String str1) {
        HashMap<Character,Integer> hm = new HashMap<>();
        char[] c = str1.toCharArray();
        for(char i : c){
            hm.put(i, hm.getOrDefault(i,0)+1);
        }
        for(char i:c){
            if(hm.get(i)==1){
                System.out.println("First non-repeated character: " + i);
                return;
            }
        }System.out.println("no non repeated char found");

    }

    private static void printFrequencyOfEachWordInString(String[] words) {
        HashMap<String, Integer> hm = new HashMap<>();
        for(String strArray : words){
            hm.put(strArray, hm.getOrDefault(strArray,0)+1);
        }
        for(Map.Entry<String, Integer> entry: hm.entrySet()){
            System.out.println(entry.getKey() + " "+ entry.getValue());
        }
    }

    private static void printFrequencyOfEachCharacter(String str) {
    char[] strArray = str.toCharArray();
    HashMap<Character,Integer> hm = new HashMap<>();
    for(char c : strArray){
        hm.put(c, hm.getOrDefault(c,0)+1);
    }
    for(Map.Entry<Character, Integer> entry : hm.entrySet()){
        System.out.println(entry.getKey() + " " + entry.getValue());
    }

    }
}
