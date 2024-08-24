package estados;

public class Baja implements IEstado {
    private Libro libro;

    public Baja(Libro libro){
        this.libro = libro;
    }
    public void hacer(){
    }
}
