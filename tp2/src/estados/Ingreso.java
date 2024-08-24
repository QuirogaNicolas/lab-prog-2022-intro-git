package estados;
import java.util.ArrayList;
import java.util.List;

public class Ingreso implements IEstado{

    private Libro libro;

    public Ingreso(Libro libro){
        this.libro = libro;
        
    }

    public void hacer(){
        if(libro.getAccion() == 1){
            System.out.println("Libro viejo enviado a revisar...");
            //en caso de que la accion sea 1 reparar seteamos el nuevo estado
            this.libro.setEstado(new Revision(this.libro));
        }else{
            //diponible
            System.out.println("Libro nuevo diponible al publico...");
            this.libro.setEstado(new Disponible(this.libro));
        }
    }
}
