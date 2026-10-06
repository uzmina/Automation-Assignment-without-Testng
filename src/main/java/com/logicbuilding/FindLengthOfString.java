package com.logicbuilding;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FindLengthOfString {

    private static final Logger log =
            LoggerFactory.getLogger(FindLengthOfString.class);
    @SuppressWarnings("unused")
    public static void main(String[] args) {

        String str = "Hello World";

        log.info("Length using length(): {}", str.length());

        char[] charString = str.toCharArray();
        int count = 0;

        for (char ignored : charString) {
            count++;
        }

        log.info("Length using toCharArray(): {}", count);

        count = 0;

        boolean running = true;

        while (running) {
            try {
                char ignored = str.charAt(count);
                count++;
            } catch (StringIndexOutOfBoundsException _) {
                log.info("Length using charAt(): {}", count);
                running = false;
            }
        }
    }
}
