public final class Casual extends Tenis{
    //Uso de final en clase: El tenis casual no podrá tener subclases

    public Casual(String marca, double precio) {
        super(marca, precio);
    }


    @Override
    public String toString() {
        return "Tenis marca " + marca + " ideales para usar todos los días. Precio: $" + precio;
    }
}
