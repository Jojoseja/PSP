package Tema1.EjerciciosRA1;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        String os = System.getProperty("os.name");
        System.out.println(os);

        Scanner sc = new Scanner(System.in);

        //TODO Completar switch case con las opciones apagado, suspender y reiniciar. Más adelante añadir tiempo de "espera" (sleep)
        while (true) {
            try {
                String input = sc.nextLine();
                System.out.println("1. Apagado, 2. Suspender, 3. Reiniciar");
                switch (input){
                    case "1":
                        System.out.println("0 Para ejecutar el comando directamente, en su defecto especificar el tiempo: ");
                        int tiempo = sc.nextInt();
                        if (os.contains("Windows")) {
                        }
                        break;
                    case "2":
                        break;
                    case "3":
                        break;
                    default:
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
                sc.next();
            }
        }
    }
}
