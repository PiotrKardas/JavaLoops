package com;


import java.util.Random;

public class Zad7 {

    public static void main(String[] args) {


        System.out.println("Liczby totolotka to dzis: ");
        for(int i = 1; i<=6; i++) {
        Random random = new Random();
        int n = random.nextInt(49) + 1;
        System.out.print(n + " ");

    }

}
}
