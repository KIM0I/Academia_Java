public class PeliAdultos extends Pelicula {
    public PeliAdultos(String titulo, String genero, String pais) {
        super(titulo, genero, pais);
    }
    @Override
    public String clasificacion(){

        return "Esta película es apta sólo para mayores de edad";
    }
}
