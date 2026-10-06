package com.logicbuilding;

public class ReverseFirstWordFromString {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        String str = "This is Java reverse string";
        System.out.println(reverseFirstWord(str));
    }

    private static String reverseFirstWord(String str) {
        String[] parts = str.split(" ", 2);

        String firstWord = parts[0];
        String remaining = parts.length > 1 ? " " + parts[1] : "";

        char[] arr = firstWord.toCharArray();

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
        String reversed = new String(arr);
        return reversed + remaining;
    }
}
