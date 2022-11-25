public abstract class Audiovisual {
    private String titulo;
    private String genero;
    private String pais;

    public Audiovisual (String titulo, String genero, String pais){
        this.titulo = titulo;
        this.genero = genero;
        this.pais = pais;
    }
    public abstract void reproducir();

    @Override
    public String toString(){
        return "-Titulo: " + getTitulo() + " - Género: " + getGenero() + " - País de origen: " + getPais() + "-";
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

}
