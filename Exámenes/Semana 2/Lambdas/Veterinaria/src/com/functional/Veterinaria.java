package com.functional;

import java.util.*;
import java.util.function.*;

//Fabiola Gómez Montiel
//Código que muestra información de mascotas registradas en una clínica veterinaria utilizando interfaces funcionales.

public class Veterinaria {
    public static void main(String[] args) {
        List<Mascota> listaMascotas = new ArrayList<>();
        listaMascotas.add(new Mascota("Solovino", "Perro", 3, 8.5, "Juan Pérez"));
        listaMascotas.add(new Mascota("Eleonora", "Hámster", 1, 0.5, "María Sánchez"));
        listaMascotas.add(new Mascota("Michi", "Gato", 3, 3.6, "Fabiola Gómez"));
        listaMascotas.add(new Mascota("Canela", "Cuyo", 5, 1.1, "Daniel Hernández"));
        listaMascotas.add(new Mascota("George", "Perro", 8, 72.3, "Jafet Meza"));
        listaMascotas.add(new Mascota("Piggy", "Cuyo", 5, 0.9, "Daniel Hernández"));
        listaMascotas.add(new Mascota("Mango", "Perico", 7, 0.05, "Sandra Martínez"));


        System.out.println("----------------");
        System.out.println("REGISTRO COMPLETO DE MASCOTAS");
        listaMascotas.forEach(System.out::println);

        System.out.println("----------------");
        System.out.println("ELIMINAR HÁMSTERS DEL REGISTRO");
        listaMascotas.removeIf(masc -> masc.getEspecie().equals("Hámster"));
        listaMascotas.forEach(System.out::println);

        System.out.println("----------------");
        System.out.println("AUMENTAR UN AÑO LA EDAD DE CADA MASCOTA");
        listaMascotas.replaceAll(masc -> {
            masc.setEdad(masc.getEdad() + 1);
            System.out.println(masc);
            return masc;
        });

        System.out.println("----------------");
        System.out.println("MOSTRAR EL DUEÑO DE CADA MASCOTA");
        listaMascotas.forEach(masc -> System.out.println("El dueño de " + masc.getNombre() + " es " + masc.getNombreDueno()));


        System.out.println("----------------");
        System.out.println("COMPARAR PESO DE DOS MASCOTAS");
        BinaryOperator<Mascota> compararPeso = (masc1,masc2) -> (masc1.getPeso()>masc2.getPeso() ? masc1 : masc2);
        Mascota mascPesada = compararPeso.apply(listaMascotas.get(1), listaMascotas.get(3));
        System.out.println("La mascota más pesada es " + mascPesada.getNombre());



    }

}