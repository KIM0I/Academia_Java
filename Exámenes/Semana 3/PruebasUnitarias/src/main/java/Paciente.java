import java.util.HashMap;

public class Paciente {
    public final HashMap<Long, PacienteHosp> pacientes = new HashMap<>();

    public PacienteHosp agregarPaciente (Long id, String nombreCompleto){
        pacientes.put(id, new PacienteHosp(id, nombreCompleto));
        return pacientes.get(id);
    }

    public PacienteHosp mostrarPaciente(Long id){
        return pacientes.get(id);
    }

    public PacienteHosp actualizarPaciente(Long id, String nombreCompleto){
        return pacientes.put(id,new PacienteHosp(id, nombreCompleto));
    }

}
