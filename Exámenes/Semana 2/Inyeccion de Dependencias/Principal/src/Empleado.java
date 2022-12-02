public class Empleado {
    String nombre;
    int edad;
    String area;
    Uniforme u;


    public Empleado(String nombre, int edad, String area) {
        this.nombre = nombre;
        this.edad = edad;
        this.area = area;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public void setUniforme(Uniforme u){
        this.u = u;
    }


   void obtenerColor(){
        u.obtenerColor();
   }



    @Override
    public String toString() {
        return "[Nombre del empleado: " + nombre + " \nEdad: " + edad + "\nÁrea" +
                ": " + area + "\n" +
u.obtenerColor() + "]";
    }
}
