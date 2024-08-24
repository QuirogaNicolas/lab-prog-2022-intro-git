package estados;
public class Disponible implements IEstado {
    private Libro libro;

    public Disponible(Libro libro){
        this.libro = libro;
    }

    public void hacer(){

        if(this.libro.getAccion() == 1){
            //vendido
            System.out.println(this.libro.getNombre()+" fue vendido.");
            this.libro.setEstado(new Vendido(this.libro));
        }else{
            //alquilado
            System.out.println(this.libro.getNombre()+" fue alquilado...");
            this.libro.setEstado(new Alquilado(this.libro));
        }
    }
}
