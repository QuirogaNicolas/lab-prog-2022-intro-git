package estados;
import java.util.ArrayList;
import java.util.List;

public class Reparacion implements IEstado {
    private Libro libro ;

    public Reparacion(Libro libro){
        this.libro = libro;
    }

    public void hacer(){
        
        if(this.libro.getAccion() == 1){
            //mal estado
            System.out.println("Libro irreparable...");
            this.libro.setEstado(new Baja(this.libro));
        }else{
            //buen estado
            System.out.println("Libro reparado ... pasa a estar disponible...");
            this.libro.setEstado(new Disponible(libro));
        }
    }
}
