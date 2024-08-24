import java.util.Random;

import estados.Libro;

public class Task implements Runnable {
    
    private Libro libro;
    private Random random;

    public Task(Libro libro){
        this.libro = libro;
        this.random = new Random();
    }

    public void run(){
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
