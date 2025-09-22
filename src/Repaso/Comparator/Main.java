package Repaso.Comparator;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Futbolista fu01 = new Futbolista("Messi", "Miami", 36, Position.ST);
        Futbolista fu02 = new Futbolista("Cristiano", "Al-Nassr", 38, Position.ST);
        Futbolista fu03 = new Futbolista("Huijsen", "Real Madrid", 20, Position.DEF);
        Futbolista fu04 = new Futbolista("Donnaruma", "City", 23, Position.GK);

        ArrayList<Futbolista> futbolistas = new ArrayList<>();

        futbolistas.add(fu01);
        futbolistas.add(fu02);
        futbolistas.add(fu03);
        futbolistas.add(fu04);



        //Lambda
        futbolistas.sort(Comparator.comparing(Futbolista::getAge));

        //Clase implemente Comparator
        futbolistas.sort(new CustomFutOrder());

        for (Futbolista futbolista : futbolistas) {
            System.out.println(futbolista);
        }
    }
}
