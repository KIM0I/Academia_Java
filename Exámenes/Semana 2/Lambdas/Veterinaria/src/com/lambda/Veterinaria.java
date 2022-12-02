package com.lambda;

import java.util.*;

//Fabiola Gómez Montiel
//Código que muestra información de mascotas registradas en una clínica veterinaria utilizando expresiones lambda.

public class Veterinaria {
    public static void main(String[] args) {
        List<Mascota> listaMascotas = List.of(
                new Mascota("Solovino","Perro", 3, 8.5, "Juan Pérez"),
                new Mascota("Eleonora","Hámster", 1, 0.5, "María Sánchez"),
                new Mascota("Michi","Gato", 3, 3.6, "Fabiola Gómez"),
                new Mascota("Canela","Cuyo", 5, 1.1, "Daniel Hernández"),
                new Mascota("George","Perro", 8, 72.3, "Jafet Meza"),
                new Mascota("Piggy","Cuyo", 5, 0.9, "Daniel Hernández"),
                new Mascota("Mango","Perico", 7, 0.05, "Sandra Martínez")
                );

        System.out.println("--------------------");
        System.out.println("Mostrar a todos los perros registrados");
        mostrarMascota(listaMascotas, masc -> masc.getEspecie().equals("Perro"));

        System.out.println("--------------------");
        System.out.println("Mostrar a todas las mascotas que pesan menos de un kilo");
        mostrarMascota(listaMascotas, masc -> masc.getPeso()<1);

        System.out.println("--------------------");
        System.out.println("Mostrar a todas las mascotas de: Daniel Hernández");
        mostrarMascota(listaMascotas, masc -> masc.getNombreDueno().equals("Daniel Hernández"));

        System.out.println("--------------------");
        System.out.println("Mostrar a todas las mascotas que no son perros ni gatos");
        mostrarMascota(listaMascotas, masc -> !masc.getEspecie().equals("Perro") && !masc.getEspecie().equals("Gato"));
    }


    static void mostrarMascota(List<Mascota> lista,
                               PredicadoMascota p){
        for(Mascota m :lista){
            if (p.probar(m))
                System.out.println(m);
        }
    }
}