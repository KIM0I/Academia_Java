public class PeliJuvenil extends Pelicula {
    public PeliJuvenil(String titulo, String genero, String pais) {
        super(titulo, genero, pais);
    }
    @Override
    public String clasificacion(){

        return "Esta película es apta para personas mayores de 12 años";
    }
}
