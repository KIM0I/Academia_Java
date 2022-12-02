public class Calzado {
    String marca;
    double precio;


    //Uso de final en variable: Se convierte en una constante ya que el porcentaje de los descuentos siempre será igual
    final double DESCUENTO_EMPLEADO = 0.25;
    final double DESCUENTO_CLIENTE_FRECUENTE = 0.1;

    public Calzado(String marca, double precio) {
        this.marca = marca;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    //Uso de final en método: Este método no podrá ser sobreescrito por las clases hijas

    final public String getDESCUENTO_EMPLEADO() {
        return " - Si eres empleado este modelo te costará: $" + (precio-(precio* DESCUENTO_EMPLEADO)) + " - ";
    }

   final public String getDESCUENTO_CLIENTE_FRECUENTE() {
       return " - Si eres cliente frecuente este modelo te costará: $" + (precio-(precio* DESCUENTO_CLIENTE_FRECUENTE)) + " - ";
    }

}
