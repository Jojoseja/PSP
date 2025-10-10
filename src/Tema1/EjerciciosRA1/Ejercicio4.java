package Tema1.EjerciciosRA1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        String os = System.getProperty("os.name");
        System.out.println(os);
        Scanner sc = new Scanner(System.in);
        //Completar switch case con las opciones apagado, reiniciar y suspender. Más adelante añadir tiempo de "espera" (sleep)
        while (true) {
            try {
                System.out.println("1. Apagar, 2. Reiniciar, 3. Suspender");
                String input = sc.nextLine();
                ProcessBuilder pb = new ProcessBuilder("");
                switch (input){
                    case "1": //Apagar
                        if (os.contains("Windows")) {
                            pb.command().set(0, "cmd");
                            pb.command().add("shutdown");
                            pb.command().add("/s");
                        } if (os.contains("Linux")) {
                            pb.command().set(0, "poweroff");
                        }
                        break;
                    case "2": //Reiniciar
                        if (os.contains("Windows")) {
                            pb.command().set(0, "cmd");
                            pb.command().add("");
                        } if (os.contains("Linux")) {
                            pb.command().set(0, "reboot");
                        }
                        break;
                    case "3": //Suspender
                        if  (os.contains("Linux")) {
                            pb.command().set(0, "sudo");
                            pb.command().add("systemctl");
                            pb.command().add("suspend");
                        }
                        break;
                    default:
                }
                System.out.println(Arrays.toString(pb.command().toArray()));
            } catch (Exception e) {
                System.out.println(e.getMessage());
                sc.next();
            }
        }
    }
    public static boolean addTime(){
        System.out.println("¿Quieres añadir \"sleep\" al comando y/n?");
        Scanner sc1 = new Scanner(System.in);
        try {
            if (sc1.next().equals("n")) {
                return false;
            } if (sc1.next().equals("y")) {
                return true;
            } else {
                throw new Exception();
            }
        }
        catch (Exception e) {
            System.out.println("Introduce una opción valida");
        }
        return false;
    }
}
