package estados;

public class Revision implements IEstado   {
    private Libro libro;

    public Revision(Libro libro){
        this.libro = libro;
    }
    
    public void hacer(){
        if(this.libro.getAccion() == 1){
            //pasa a reparacion
            this.libro.setEstado(new Reparacion(this.libro));
        }else{
            //el libro pasa a diponible
            this.libro.setEstado(new Disponible(this.libro));
        }
    }
}
