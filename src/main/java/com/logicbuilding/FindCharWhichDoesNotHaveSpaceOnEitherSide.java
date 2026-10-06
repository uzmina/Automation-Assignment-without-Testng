package com.logicbuilding;

public class FindCharWhichDoesNotHaveSpaceOnEitherSide {
    @SuppressWarnings("unused")
    public static void main(String[] args){
        String str = " Hie ";//there is only one char which does not have space on either side ie; i
        int count = 0;
        char[] data = str.toCharArray();
        for(int i=0; i<data.length;i++) {
                if(data[i] ==' '){
                    continue;
                }
                //check for two conditions
                // first index is not out of bound i<data.length -1
                // next char is a whitespace or not so data[i+1] == ' '
                //store thr result as boolean
                Boolean whiteSpaceAfterTheChar = i<data.length-1 && data[i+1] == ' ';
                /* then check for two condtions for whitespace after the char
                * starting index is zero so  when the whitespace is checked before a character
                * then index has to be > than 0
                */
                Boolean  whiteSpaceBeforeTheChar= i > 0 && data[i-1] == ' ';
                //if there is no whitepace before the character and after the character then increment the count
                if(!whiteSpaceBeforeTheChar && !whiteSpaceAfterTheChar){
                    count++;
                }
        }
        System.out.println("Count is "+count);//will print 1 in above case as i is the only char which does not have a space before ot after

    }
}
