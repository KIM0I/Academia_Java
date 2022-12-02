public class Pijama extends Uniforme{

    public Pijama(String color){
        super(color);
    }


    @Override
    final String obtenerColor() {
        return "Su pijama quirúrgica es de color " + color;
    }

}
