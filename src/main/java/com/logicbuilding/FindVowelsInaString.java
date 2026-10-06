package com.logicbuilding;

public class FindVowelsInaString {
    @SuppressWarnings("unused")
    public static void main(String[] args){
        String str = "abcdefg hinj klmn opqr stuv awxyz";
        findVowels(str);
        doesStringContainSpaces(str);
    }

    private static void doesStringContainSpaces(String str) {
        char[] data = str.toCharArray();
        int count = 0;
        for(char c: data){
            if(c == ' '){
                count++;
            }
        }
        System.out.println("The number of  white spaces in the String " + count  );
    }

    private static void findVowels(String str) {
        char[] data = str.toCharArray();
        int count = 0;
        int count1 = 0;
        int count2 = 0;
        for(char v: data){
            if(v == 'a' || v == 'e' || v== 'i' || v== 'o' || v== 'u'){
                count++;
            }else if(v == ' '){
                count1++;
            }else{
                count2++;
            }
        }
        System.out.println("String contains vowels " + count + " \n and consonants are " + count2 + " \n and white spaces are " + count1);
    }
}
