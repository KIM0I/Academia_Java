public class Pelicula extends Audiovisual{

    public Pelicula(String titulo, String genero, String pais){
        super(titulo, genero, pais);
    }

    @Override
    public void reproducir(){
        System.out.println("Ahora estás viendo " + getTitulo());
    }

}
