package com;

import java.util.Random;
import java.util.Scanner;

public class Zad6 {
    public static void main(String[] args) {
        Random random = new Random();
        int n = random.nextInt( 600)+1;
        Scanner scanner = new Scanner(System.in);
        int i = 0;

        do {
            System.out.println("Podaj liczbę: ");
            i = scanner.nextInt();
                if(i > n )
                    System.out.println("Musisz podać mniejszą liczbę.");
                else if (i < n)
                    System.out.println("Musisz podać większą liczbę.");


        }while (i != n);

        System.out.println("Bingo! Szukana liczba to: " + n);
        }
    }

