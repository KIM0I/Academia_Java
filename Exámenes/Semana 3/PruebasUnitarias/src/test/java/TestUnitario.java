import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestUnitario {

    @DisplayName("Llamar al paciente por ID")
@Test
    public void mismoID(){

    PacienteHosp esperado = new PacienteHosp(1L,"Fabiola Gomez Montiel");
    Paciente pacienteHospital = new Paciente();
    final PacienteHosp resultado = pacienteHospital.agregarPaciente(1L,"Fabiola Gomez Montiel");
        Assertions.assertEquals(esperado.id,resultado.id);

    }

    @DisplayName("Llamar al paciente por Nombre")
    @Test
    public void mismoNombre(){

        PacienteHosp esperado = new PacienteHosp(1L,"Fabiola Gomez Montiel");
        Paciente pacienteHospital = new Paciente();
        final PacienteHosp resultado = pacienteHospital.agregarPaciente(1L,"Fabiola Gomez Montiel");
        Assertions.assertEquals(esperado.nombreCompleto,resultado.nombreCompleto);

    }
}
