package com.logicbuilding;
//this is too reverse each word in the same index instead of reversing the whole string
public class ReverseTheCharsOfWordsInAString {
    @SuppressWarnings("unused")
    public static void main(String[] args){
        String str = "This is the string to be reversed";
        String[] strArray = str.split(" ");//split the string on the basis od space to get individual words
        String results = "";
        //When there is a reverse use two pointers left and right

        for(String words: strArray){
            char[] word = words.toCharArray();//converting words to char and storing in a char array
            int left = 0; //intialising left index of char array
            int right = word.length-1;//intialising right index to read backwards of char array
            while(left<right){//as long as left is not greater than right
                char temp = word[left];//if left is less then right assign the left value to temp placeholder
                word[left] = word[right];//assign right char to left char
                word[right] = temp;//assign original left char value to right replacing
                left++;//go to next left char index
                right--;//go to next right char index
            }//once left becomes equal to right side or reaches center
            results = results + new String(word) + " "; //increment results to results with word
        }
        System.out.println(str);//print original string
        System.out.println(results.trim());// print reversed string and trim any extra chars
        usingStringBuilderClass(str);
    }

    private static void usingStringBuilderClass(String str) {
        String[] strArray = str.split(" ");//split words of the string on the basis of space
        StringBuilder results = new StringBuilder();//create results to store reversed word
        for (String words : strArray) {//iterate through each word in the string
            StringBuilder reversedWord = new StringBuilder(words);//create a new temp holder to store reversed word
            //since string is immutable it create a new string everytime so using string builder
            //results variable store the reversed string by appending temp holder and calling reverse menthod and calling append method to reverse to create space between each word
            results.append(reversedWord.reverse().append(" "));
        }
        System.out.println(results.toString().trim());
    }
}
