public class Botas extends Calzado{
    public Botas(String marca, double precio) {
        super(marca, precio);
    }

    @Override
    public String toString() {
        return "Botas {" +
                "Marca:'" + marca + '\'' +
                ", Precio:" + precio +
                '}';
    }
}
