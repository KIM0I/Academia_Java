import java.util.*;
//Fabiola Gómez Montiel

public class Netflix {
    public static void main(String[] args) {

List<Audiovisual> ListaAudiovisual = new ArrayList<>();

    ListaAudiovisual.add(new PeliInfantil("Encanto", "Musical", "Estados Unidos"));
    ListaAudiovisual.add(new PeliAdultos("Midsommar", "Horror", "Suecia"));
    ListaAudiovisual.add(new PeliJuvenil("Avengers: Endgame", "Superhéroes", "Estados Unidos"));

    for(Audiovisual audiovisual : ListaAudiovisual){
        System.out.println("____________________");
    System.out.println(audiovisual.getTitulo()) ;
        System.out.println(audiovisual.clasificacion());
}


}
}
