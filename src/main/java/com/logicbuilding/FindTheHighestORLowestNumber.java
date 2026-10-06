package com.logicbuilding;

import java.util.TreeSet;

public class FindTheHighestORLowestNumber {
    @SuppressWarnings("unused")
    public static void main(String[] args){
        String str ="1abcdef 325 8695etc";
        isLowest(str);
        isHighest(str);
        isSecondLargest(str);
        isSecondSmallest(str);
        usingSetToFindSecondLargestNum(str);
        usingSetToFindSecondSmallestNum(str);
    }

    private static void usingSetToFindSecondSmallestNum(String str) {
        char[] data = str.toCharArray();
        TreeSet<Integer> dataSet = new TreeSet<>();
        for(char c : data){
            if(Character.isDigit(c)){
                int num = c-'0';
                dataSet.add(num);
            }
        }
        System.out.println("The original digits in asc order "+dataSet);
        dataSet.pollFirst();
        System.out.println("After poll first "+dataSet);
        System.out.println("The second smallest number is "+dataSet.first());

    }

    private static void usingSetToFindSecondLargestNum(String str) {
        char[] data = str.toCharArray();
        TreeSet<Integer> dataSet = new TreeSet<>();
        for(char c : data){
            if(Character.isDigit(c)){
                int num = c-'0';
                dataSet.add(num);
            }
        }
        System.out.println(dataSet);
        dataSet.pollLast();
        System.out.println(dataSet);
        System.out.println(dataSet.last());
    }

    private static void isSecondSmallest(String str) {
        char[] arr = str.toCharArray();
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        for(char c : arr){
            if(Character.isDigit(c)){
                int num = c-'0';
                if(num < first){
                    second = first;
                    first = num;
                }else if(num<second && num>first){
                    second=num;
                }
            }
        }
        System.out.println("the second smallest number is "+second);
    }

    private static void isHighest(String str) {
        char[] arr = str.toCharArray();
        int highest =Integer.MIN_VALUE;
        for(char c:arr){
            if(Character.isDigit(c)){
                int num = c-'0';
                if(num>highest){
                    highest=num;
                }
            }
        }
        System.out.println("The highest number is "+highest);
    }

    private static void isSecondLargest(String str) {
        char[] arr = str.toCharArray();
        int num = 0;
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for(char data:arr){
            if(Character.isDigit(data)){
                num = data-'0';//convert the char into int
                if(num > first){
                    second = first;
                    first = num;
                } else if (num>second && num <first) {
                    second =num;
                }
            }
        }
        System.out.println("the second largest number is "+second);
    }

    private static void isLowest(String str) {
       char[] data = str.toCharArray();

       int lowest = Integer.MAX_VALUE;
       for(char c:data){
           if(Character.isDigit(c)){
               int num = c-'0';
               if(num<lowest){
                   lowest=num;
               }
           }
       }
        System.out.println("The lowest number is "+lowest);
    }
}
