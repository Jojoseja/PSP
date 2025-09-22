package Repaso;

import java.util.ArrayList;

public class Ej4 {
    public static void main(String[] args) {
        Alumno al01 = new Alumno("Alberto", 6.5f);
        Alumno al02 = new Alumno("Antonio", 6.5f);
        Alumno al03 = new Alumno("Alvaro", 6.5f);
        Alumno al04 = new Alumno("Alejandro", 6.5f);
        Alumno al05 = new Alumno("Alicia", 6.5f);
        Alumno al06 = new Alumno("Ana", 6.5f);

        ArrayList<Alumno> alumnos = new ArrayList<Alumno>();

        alumnos.add(al01);
        alumnos.add(al02);
        alumnos.add(al03);
        alumnos.add(al04);
        alumnos.add(al05);
        alumnos.add(al06);


        System.out.println(mediaAlumnos(alumnos));
    }
    public static float mediaAlumnos(ArrayList<Alumno> alumnos) {
        float total_sum = 0f;
        String out = "";

        for  (Alumno alumno : alumnos) {
            total_sum += alumno.media;
            out += alumno.nombre + " ";
        }
        System.out.println(out);

        return total_sum / alumnos.size();

    }

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
