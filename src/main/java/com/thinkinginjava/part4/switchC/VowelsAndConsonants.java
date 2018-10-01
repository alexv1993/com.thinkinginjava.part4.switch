package com.thinkinginjava.part4.switchC;

import java.util.Random;

/**
 * Created by Alex on 30.09.2018.
 */
public class VowelsAndConsonants {
    public static void main(String[] args) {
        Random rand = new Random(47);
        for (int i = 0; i < 100; i++) {
            int c = rand.nextInt(26) + 'a';
            System.out.println((char) c + ", " + c + ": ");
            switch (c) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.println("гласная");
                    break;
                case 'y':
                case 'w':
                    System.out.println("Условно гласная");
                    break;
                default:
                    System.out.println("согласная");

            }
        }
    }
}
