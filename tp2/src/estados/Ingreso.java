package estados;
import java.util.ArrayList;
import java.util.List;

public class Ingreso implements IEstado{

    private Libro libro;

    public Ingreso(Libro libro){
        this.libro = libro;
        
    }

    public void hacer(){
        System.out.println(this.libro.getNombre()+" ingresado.");
        if(libro.getAccion() == 1){
            System.out.println(this.libro.getNombre()+" Libro viejo enviado a revisar...");
            //en caso de que la accion sea 1 reparar seteamos el nuevo estado
            this.libro.setEstado(new Revision(this.libro));
        }else{
            //diponible
            System.out.println(this.libro.getNombre()+" Libro nuevo diponible al publico...");
            this.libro.setEstado(new Disponible(this.libro));
        }
    }
}
