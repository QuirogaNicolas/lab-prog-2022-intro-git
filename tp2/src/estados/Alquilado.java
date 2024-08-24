package estados;

public class Alquilado implements IEstado{
    private Libro libro;

    public Alquilado(Libro libro){
        this.libro = libro;
    }

    public void hacer(){
        if(this.libro.getAccion() == 1){
            //perdido
            System.out.println(this.libro.getNombre()+" fue perdido.");
            this.libro.setEstado(new Perdido(this.libro));
        }else{
            //revision
            System.out.println(this.libro.getNombre()+" fue devuelto y pasa a revision...");
            this.libro.setEstado(new Revision(this.libro));
        }
    }
}
