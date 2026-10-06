package com.logicbuilding;

public class FindPalindrome {
    @SuppressWarnings("unused")
    public static void main(String[] args){
        System.out.println(checkPalindrome("church"));
        System.out.println(checkPalindrome("java"));
        System.out.println(checkPalindrome("madam"));
        System.out.println(checkPalindrome("malayalam"));
        System.out.println(checkPalindrome("racecar"));
        System.out.println(checkPalindrome("123454321"));
        System.out.println(checkPalindrome("abc123"));
    }

    private static Boolean checkPalindrome(String str) {

        int left = 0;
        int right = str.length()-1;
        while(left<right){
            if(str.charAt(left)!= str.charAt(right)){
                return false;
            }

            left++;
            right --;

        }
        return true;
    }
}
