package com.upax.zeus.util;

import java.util.Random;

public class TestUtil {

    public static Integer getRandomNumber(int max,int min){
        Random rand = new Random();
        int random = rand.nextInt((max - min) + 1) + min;
        return random;
    }

    public static String generateRandomString(int length) {
        Random random = new Random();
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            char randomChar = (char) ('a' + random.nextInt(26));
            sb.append(randomChar);
        }
        return sb.toString();
    }


}
