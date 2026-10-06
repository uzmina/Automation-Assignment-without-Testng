package com.logicbuilding;

public class ReverseString {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        useForLoopToReverse("Hell0 World");
        usingStringBuilderMethod("this is the string to be reversed");
        usingCharArrayMethod("using toCharArray method");
        System.out.println(reverseUsingTwoPointers("Uzmina Anjum"));


    }

    private static void useForLoopToReverse(String str) {

        String reverseStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverseStr += String.valueOf(str.charAt(i));
            //can also be written as reverseStr = reverserStr+ String....
        }
        System.out.println(reverseStr);
    }

    private static void usingStringBuilderMethod(String str) {
        String reversed = "";
        reversed = new StringBuilder(str).reverse().toString();
        System.out.println(reversed);
    }

    private static void usingCharArrayMethod(String str) {

        char[] chars = str.toCharArray();
        String reversed = "";
        for (int i = chars.length - 1; i >= 0; i--) {
            reversed += (chars[i]);
        }
        System.out.println(reversed);
    }

    private static String reverseUsingTwoPointers(String str){
        char[] arr = str.toCharArray();
        int left = 0;
        int right = arr.length-1;
        while(left<right){
            char temp = arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        String reversed = new String(arr);
        return reversed;
    }
}
