package com;


import java.util.Scanner;

public class zad9 {

    public static void main(String[] args) {

        System.out.println("Podaj liczbe:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int power = 1;
        for(int i = 1; i <= n; i++)
        {
            power*=i;
        }
        System.out.println("Silnia z liczby "+ n+ " to : "+ power);
    }


}
