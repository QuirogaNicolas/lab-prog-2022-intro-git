import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import estados.Libro;

public class App {
    public static void main(String[] args) throws Exception {
        Random random = new Random();
        //creamos un libro

        Libro libro = new Libro("el principe", 0);


        // Crear un ExecutorService con un pool de 2 hilos
        ExecutorService executor = Executors.newFixedThreadPool(2);
        
        // Crear instancias de tareas Runnable
        Runnable task1 = new Task(new Libro("20000 leguas en viaje submarino", 0));
        Runnable task2 = new Task(new Libro("El Hobbit", 1));
        Runnable task3 = new Task(new Libro("El silmarilion", 2));
        Runnable task4 = new Task(new Libro("El señor de los anillos - la comunidad del anillo", 3));
        Runnable task5 = new Task(new Libro("El señor de los anillos - las dos torres ", 4));
        Runnable task6 = new Task(new Libro("El señor de los anillos - el retorno del rey", 5));

        // Enviar las tareas al ExecutorService
        executor.execute(task1);
        executor.execute(task2);
        executor.execute(task3);
        executor.execute(task4);
        executor.execute(task5);
        executor.execute(task6);
        
        // Apagar el ExecutorService
        executor.shutdown();
    }
}
