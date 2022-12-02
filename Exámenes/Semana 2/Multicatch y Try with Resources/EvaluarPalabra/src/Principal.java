import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Random;

public class Principal {
    public static void main(String[] args) {

        String[] animales = {"Perro", "Gato", "Gallina", "Camarón", "Oveja", "Elefante", "Canguro", "Cabra", "Zorrillo", "Mapache", "Pollo"};
        Random aleatorio = new Random();
        char[] animal = animales[aleatorio.nextInt(animales.length)].toCharArray();

        System.out.println("¿CUÁL ES LA SEXTA LETRA DE LA PALABRA?");
        System.out.println("--------------------------------------");


        try {
            System.out.println(animal);
            char caracter = animal[5];
            System.out.println("La sexta letra de la palabra " + Arrays.toString(animal) + " es " + caracter);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Esa palabra no tiene suficientes letras");
        } finally {
            System.out.println("--------------------------------------");
            System.out.println("Programa finalizado");
        }
        }

    }

