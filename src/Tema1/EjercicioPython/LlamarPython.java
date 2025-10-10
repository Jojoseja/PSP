package Tema1.EjercicioPython;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.nio.file.Path;

public class LlamarPython {
    public static void main(String[] args) {
        String os =  System.getProperty("os.name");
        String python = "";

        String source = System.getProperty("user.dir");

        Path p = Path.of("src", "Tema1", "EjercicioPython");
        File f = new File(p.toString());

        ProcessBuilder pb = new  ProcessBuilder();

        if (os.contains("Linux")){
            pb.command("python3", "proceso_python.py");
        } else if (os.contains("Win")){
            pb.command("cmd", "python", "proceso_python.py");
        }


        pb.directory(f);

        try {
            Process pro = pb.start();

            try (BufferedReader br1 = new BufferedReader(new InputStreamReader(pro.getInputStream()))) {
                String line;
                while ((line = br1.readLine()) != null) {
                    System.out.println(line);
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
}
