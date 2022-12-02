package com.functional;

public class Mascota {
    private String nombre;
    private String especie;
    private int edad;
    private double peso;
    private String nombreDueno;

    public Mascota(String nombre, String especie, int edad, double peso, String nombreDueno) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.peso = peso;
        this.nombreDueno = nombreDueno;

    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    public String getNombreDueno() {
        return nombreDueno;
    }

    public void setNombreDueno(String nombreDueno) {
        this.nombreDueno = nombreDueno;
    }

    @Override
    public String toString(){
        return "Mascota: " + nombre +  " - Especie: " + especie + "  - Edad: " + edad + " año(s). - Peso: " + peso + " kg. - Dueño: " + nombreDueno;
    }
}
