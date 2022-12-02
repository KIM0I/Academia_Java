public final class Trabajo extends Botas{
    //Uso de final en clase: La bota de trabajo no podrá tener subclases

    public Trabajo(String marca, double precio) {
        super(marca, precio);
    }


    @Override
    public String toString() {
        return "Botas marca " + marca + " ideales para realizar trabajo pesado. Precio: $" + precio;
    }
}
