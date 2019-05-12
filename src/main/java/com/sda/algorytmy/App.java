package com.sda.algorytmy;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ilosc liczb teraz: ");
        int n = scanner.nextInt();
        int wynik = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Podaj liczbe teraz: ");
            int a = scanner.nextInt();
            wynik = wynik + a;
        }
        System.out.println("Srednia arytmetyczna wynosi: " + wynik/n);


    }
}
