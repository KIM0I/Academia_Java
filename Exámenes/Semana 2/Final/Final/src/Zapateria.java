import java.util.List;
//Fabiola Gómez Montiel
//Código que usa diferentes usos de final.
//Se muestra información de productos de una zapatería y se pueden obtener descuentos para clientes frecuentes o empleados.

public class Zapateria {
    public static void main(String[] args) {
        List<Calzado> listaCalzado = getCalzado();

        System.out.println("LISTA DE PRODUCTOS");
        for(Calzado calz : listaCalzado) {
            System.out.println("-------------");
            System.out.println(calz.toString());
        }

        System.out.println("-------------");
        System.out.println("PRECIO DE UNAS BOTAS DE TRABAJO CON DESCUENTO DE EMPLEADO");
        Calzado c1 = new Trabajo("Flexi", 360.50);
        System.out.println(c1+ "\n" + c1.getDESCUENTO_EMPLEADO());

        System.out.println("-------------");
        System.out.println("PRECIO DE UNOS TENIS DEPORTIVOS CON DESCUENTO DE CLIENTE FRECUENTE");
        Calzado c2 = new Deportivo("Nike", 980.00);
        System.out.println(c2+ "\n" + c2.getDESCUENTO_CLIENTE_FRECUENTE());




    }
        static List<Calzado> getCalzado () {
            return List.of(
                    new Deportivo("New Balance", 850.00),
                    new Trabajo("Timberland", 678.99),
                    new Casual("Converse", 520.99),
                    new Lluvia("Hush Puppies", 150.60)
            );




    }
}