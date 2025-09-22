package Repaso;

import java.util.ArrayList;

public class Ej4 {
    public static void main(String[] args) {
        Alumno al01 = new Alumno("Maria", 10f);
        Alumno al02 = new Alumno("José", 5);
        Alumno al03 = new Alumno("Juan", 8);
        Alumno al04 = new Alumno("Laura", 7);
        Alumno al05 = new Alumno("Francisco", 4);
        Alumno al06 = new Alumno("Ana", 5);

        ArrayList<Alumno> alumnos = new ArrayList<>();

        alumnos.add(al01);
        alumnos.add(al02);
        alumnos.add(al03);
        alumnos.add(al04);
        alumnos.add(al05);
        alumnos.add(al06);


        System.out.println("La media total es de: " + mediaAlumnos(alumnos));
    }
    public static float mediaAlumnos(ArrayList<Alumno> alumnos) {
        float total_sum = 0f;
        String out = "";

        for  (Alumno alumno : alumnos) {
            total_sum += alumno.media;
            out += alumno.nombre + " " + alumno.media + "\n";
        }
        System.out.println(out);

        return total_sum / alumnos.size();

    }

    //Clase alumno con atributo String nombre y float media
    public static class Alumno {
        private String nombre;
        private float media;

        public Alumno(String nombre, float media) {
            this.nombre = nombre;
            this.media = media;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public float getMedia() {
            return media;
        }

        public void setMedia(float media) {
            this.media = media;
        }

        @Override
        public String toString() {
            return "Alumno{" +
                    "nombre='" + nombre + '\'' +
                    ", media=" + media +
                    '}';
        }
    }
}
