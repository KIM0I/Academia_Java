public class Serie extends Audiovisual {
    public Serie (String titulo, String genero, String pais){
        super (titulo, genero, pais);
    }
    @Override
    public void reproducir(){
        System.out.println("¿Quieres ver " + getTitulo() + " desde el capítulo 1?");
    }
}

