package com;

//hasla ze spacja

import java.util.Scanner;

public class Zad8 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String password = "Polska";
        String word = null;
        do{
            System.out.println("Podaj hasło: ");
            word = scanner.next();
            if(!word.equals(password))
                System.out.println("Podałeś złe hasło. Spróbuj jeszcze raz.");


    }while(!word.equals(password));
        System.out.println("Hasło poprawne. ");

    }


}
