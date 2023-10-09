package com.sofka;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        List<List<String>> school = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Cual es tu nombre: ");
        String name = scanner.nextLine();

        System.out.println("Hola " + name + "!");

        scanner.close();
    }
}
