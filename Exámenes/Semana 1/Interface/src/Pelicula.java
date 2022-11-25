public abstract class Pelicula implements Audiovisual{
    private String titulo;
    private String genero;
    private String pais;


    public Pelicula (String titulo, String genero, String pais){
        super();
        this.titulo = titulo;
        this.genero = genero;
        this.pais = pais;

    }

    @Override
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }



}
