package estados;
import java.util.List;

public class Libro implements IEstado{
    private String nombre;
    private int ID;
    private int accion;
    private List<String> acciones;
    private IEstado estado;

    public Libro(String nombre, int ID){
        this.ID  = ID;
        this.nombre = nombre;
        this.estado = new Ingreso(this);
    }

    public void hacer(){

        this.estado.hacer();
    }

    public void setEstado(IEstado estado){
        this.estado = estado;
    }

    public int getAccion(){
        return accion;
    }

    public void setAccion(int accion){
        this.accion = accion;
    }

    public String getNombre(){
        return nombre;
    }
}
