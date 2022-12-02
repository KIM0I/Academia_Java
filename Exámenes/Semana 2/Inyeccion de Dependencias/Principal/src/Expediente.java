//Fabiola Gómez Montiel
//Se usa inyección de dependencias para otorgarle a cada trabajador una bata o una pijama quirúrgica de un color específico dependiendo de su puesto de trabajo.
//Un expediente muestra el nombre, edad, área y color del uniforme de cada trabajador.


public class Expediente {
    public static void main(String[] args) {

        System.out.println("EXPEDIENTES - TRABAJADORES");

        Empleado e1 = new Empleado("Martín Espinosa", 45, "Pediatría");
        HospitalInyector.inyectaUniforme(e1,Trabajadores.MESPECIALISTA);
        System.out.println(e1);

        System.out.println("----------------------");
        Empleado e2 = new Empleado("Diana Sánchez",26, "Otorrinolaringología");
        HospitalInyector.inyectaUniforme(e2,Trabajadores.CAMILLERO);
        System.out.println(e2);

        System.out.println("----------------------");
        Empleado e3 = new Empleado("Antonio Barajas", 37,"Cardiología");
        HospitalInyector.inyectaUniforme(e3,Trabajadores.CIRUJANO);
        System.out.println(e3);

        System.out.println("----------------------");
        Empleado e4 = new Empleado("Rodrigo Guarneros", 29, "Cardiología");
        HospitalInyector.inyectaUniforme(e4,Trabajadores.ENFERMERO);
        System.out.println(e4);

        System.out.println("----------------------");
        Empleado e5 = new Empleado("Pedro Sánchez", 31, "Dermatología");
        HospitalInyector.inyectaUniforme(e5,Trabajadores.MGENERAL);
        System.out.println(e5);

        System.out.println("----------------------");
        Empleado e6 = new Empleado("Carolina León", 23, "Traumatología");
        HospitalInyector.inyectaUniforme(e6,Trabajadores.TSOCIAL);
        System.out.println(e6);
    }

}
