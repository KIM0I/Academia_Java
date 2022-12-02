public final class Lluvia extends Botas{
    //Uso de final en clase: La bota de lluvia no podrá tener subclases

    public Lluvia(String marca, double precio) {
        super(marca, precio);
    }


    @Override
    public String toString() {
        return "Botas impermeables marca " + marca + " perfectas para los días más lluviosos. Precio: $" + precio;
    }
}
