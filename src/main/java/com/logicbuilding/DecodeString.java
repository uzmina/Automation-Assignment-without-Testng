package com.logicbuilding;

public class DecodeString {
    @SuppressWarnings("unused")
    public static void main(String[] args){
        String input = "a2b4c3d3m5t3o8f1e0l5";
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<input.length(); i = i+2){
            char letter = input.charAt(i);
            int count = Character.getNumericValue(input.charAt(i+1));
            for(int j = 0; j<count; j++){
                sb.append(letter);
            }
        }
    System.out.println(sb);
    }

}
