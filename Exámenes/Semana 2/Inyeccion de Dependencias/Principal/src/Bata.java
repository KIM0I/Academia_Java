public class Bata extends Uniforme{

    String color;

    public Bata(String color){
        super(color);
        this.color = color;
    }

    @Override
    final String obtenerColor() {
        return "Su bata es de color " + color;
    }


}
