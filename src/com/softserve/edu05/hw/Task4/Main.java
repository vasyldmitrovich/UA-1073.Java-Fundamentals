package com.softserve.edu05.hw.Task4;

import javax.swing.plaf.synth.SynthLookAndFeel;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int randomNumber = GuessNumber.createRandomNumber();
        System.out.println(randomNumber);
        int guess =  GuessNumber.askNumber();
        GuessNumber.chechIfCorrect(guess, randomNumber);
    }
}
