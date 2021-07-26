package com.company;

import java.util.Random;

public class StringGenerator {

    private StringGenerator () {


    };

    //private final String alphabet = "abcdefghijklmnopqrstuvwxyz";
    private static final String consonants = "bcdfghjklmnpqrstvwxyz";
    private static final String vowels = "aeiou";

     public static String generateString (int lowerLimit, int upperLimit) {
        Random rand = new Random();
        int length;
        StringBuilder result = new StringBuilder();
        //char[] charAlphabet = this.alphabet.toCharArray();
        char[] charConsonants = consonants.toCharArray();
        char[] charVowels = vowels.toCharArray();
        char[][] chars = new char[2][];
        int nameStartRandomizer = rand.nextInt(2);
        chars[nameStartRandomizer % 2] = charVowels;
        chars[(nameStartRandomizer + 1) % 2] = charConsonants;
        length = rand.nextInt(upperLimit - lowerLimit + 1) + lowerLimit;
        for (int i = 0; i < length; i++) {
            //result.append(charAlphabet[rand.nextInt(charAlphabet.length)]);
            result.append(chars[i % 2][rand.nextInt(chars[i % 2].length)]);

        };
        if (result.length() > 0) {
            result.replace(0,1, String.valueOf(result.charAt(0)).toUpperCase());
        };
        return result.toString();
    };



}
