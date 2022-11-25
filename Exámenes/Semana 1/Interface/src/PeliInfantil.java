public class PeliInfantil extends Pelicula {
    public PeliInfantil(String titulo, String genero, String pais) {
        super(titulo, genero, pais);
    }
    @Override
    public String clasificacion(){
        return "Esta película es apta para todo público";
    }
}
