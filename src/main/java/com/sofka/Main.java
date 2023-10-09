package com.sofka;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<List<String>> school = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        //Un estudiante que está en una clase
        //no puede estar en otra clase al mismo tiempo
        //y esto lo identificamos con el nombre completo (Nombre y apellido).

        String menu = "1-Crear clase\n" +
                "2-Añadir estudiante a clase" +
                "3-Eliminar estudiantes de una clase\n" +
                "4-Buscar estudiantes dentro de una clase\n" +
                "5-Buscar todos los estudiantes que tienen el mismo nombre.\n" +
                "6-Finalizar ejecución";

        boolean doContinue = true;

        while (doContinue){
            System.out.print("¿Cual acción quieres realizar? }¿\n" +
                    "escribe el número de la acción: ");

            int chosenOption = scanner.nextInt();

            switch (chosenOption){
                case 1:
                    System.out.println("Crear clase");
                    break;
                case 2:
                    System.out.println("Añadir estudiante a clase");
                    break;
                case 3:
                    System.out.println("Eliminar estudiante de una clase");
                    break;
                case 4:
                    System.out.println("Buscar estudiante dentro de una clase");
                    break;
                case 5:
                    System.out.println("Buscar estudiantes que tienen el mismo nombre");
                    break;
                case 6:
                    System.out.println("Finalizar ejecución");
                    doContinue = false;
                    break;
                default:
                    System.out.println("La opción escogida no es valida\n" +
                            "Selecciona otra:");
                    break;
            }
        }



        scanner.close();
    }
}