package estados;

public class Revision implements IEstado   {
    private Libro libro;

    public Revision(Libro libro){
        this.libro = libro;
    }
    
    public void hacer(){
        if(this.libro.getAccion() == 1){
            //pasa a reparacion
            System.out.println(this.libro.getNombre()+" libro revisado y enviado a reparar...");
            this.libro.setEstado(new Reparacion(this.libro));
        }else{
            //el libro pasa a diponible
            System.out.println(this.libro.getNombre()+" libro revisado y puesto en disponibilidad...");
            this.libro.setEstado(new Disponible(this.libro));
        }
    }
}
