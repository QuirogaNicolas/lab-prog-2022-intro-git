import java.util.Random;

import estados.Libro;

public class App {
    public static void main(String[] args) throws Exception {
        Random random = new Random();
        //creamos un libro
        Libro libro = new Libro("el principe", 0);

        int iteraciones = 10;
        int i = 0;

        while (i < iteraciones) {
            libro.setAccion(random.nextInt(1, 3));
            //ingreso
            libro.hacer();    
            i++;        
        }

    }
}
