public final class Deportivo extends Tenis{
    //Uso de final en clase: El tenis deportivo no podrá tener subclases

    public Deportivo(String marca, double precio) {
        super(marca, precio);
    }


    @Override
    public String toString() {
        return "Tenis marca " + marca + " adecuados para hacer deporte. Precio: $" + precio;
    }
}
