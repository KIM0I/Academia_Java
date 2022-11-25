import javax.sql.rowset.serial.SerialException;
import java.util.ArrayList;
import java.util.List;
//Fabiola Gómez Montiel

public class Netflix {
    public static void main(String[] args) {

        List<Audiovisual> ListaAudiovisual = new ArrayList<>();

        ListaAudiovisual.add(new Pelicula("IT","Horror","Estados Unidos"));
        ListaAudiovisual.add(new Serie("La casa de papel","Suspenso","España"));
        ListaAudiovisual.add(new Pelicula("Parasyte","Suspenso","Corea del Sur"));
        ListaAudiovisual.add(new Serie("Bob Esponja","Humor","Estados Unidos"));
        ListaAudiovisual.add(new Pelicula("Roma","Drama","México"));
        ListaAudiovisual.add(new Serie("Merlín","Fantasía","Reino Unido"));

        for(Audiovisual audiovisual : ListaAudiovisual){
            System.out.println("*******");
            System.out.println(audiovisual.getClass());
            System.out.println(audiovisual.toString()) ;
            audiovisual.reproducir();


    }
    }
    }

