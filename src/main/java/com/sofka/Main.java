package com.sofka;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<List<String>> school = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        //Un estudiante que está en
        // una clase no puede estar en otra clase al mismo
        // tiempo y esto lo identificamos con el nombre completo.

        String menu = "1-Añadir estudiantes\n" +
                "2-Eliminar estudiantes\n" +
                "3-Buscar estudiantes dentro de una clase\n" +
                "4-Buscar todos los estudiantes que tienen el mismo nombre.\n";

        scanner.close();
    }
}