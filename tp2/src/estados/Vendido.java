package estados;

public class Vendido implements IEstado {
    private Libro libro;
    
    public Vendido(Libro libro){
        this.libro = libro;
    }

    public void hacer(){
        
    }
}
