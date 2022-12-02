import org.w3c.dom.ls.LSOutput;

public class Tenis extends Calzado{
    public Tenis(String marca, double precio) {
        super(marca, precio);
    }

    @Override
    public String toString() {
        return "Tenis {" +
                "Marca:'" + marca + '\'' +
                ", Precio:" + precio +
                '}';
    }
}
