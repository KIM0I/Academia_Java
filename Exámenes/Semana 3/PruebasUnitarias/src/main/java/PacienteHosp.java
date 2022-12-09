public class PacienteHosp {
    final Long id;
    final String nombreCompleto;

    public PacienteHosp(Long id, String nombreCompleto){
        this.id = id;
        this.nombreCompleto = nombreCompleto;
    }

    public Long getId() {
        return id;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }
}
