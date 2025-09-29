package Tema1.EjerciciosRA1;

import java.util.Random;

public class Aleatorio {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        int num = aleatorio.nextInt(0,10);
        System.out.println(num);
    }
}
