package Tema1.EjerciciosRA1;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        String os = System.getProperty("os.name");
        System.out.println(os);

        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                String input = sc.nextLine();
                switch (input){
                    case "1":
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
