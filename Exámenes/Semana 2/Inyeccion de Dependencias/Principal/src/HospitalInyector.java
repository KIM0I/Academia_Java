public class HospitalInyector {

    static Bata bb = new Bata("blanco");
    static Bata ba = new Bata("azul");
    static Pijama pb = new Pijama("blanco");
    static Pijama pa = new Pijama("azul");
    static Pijama pv = new Pijama("verde");



    static void inyectaUniforme(Empleado e, Trabajadores trabajadores){
        switch (trabajadores){
            case ENFERMERO: e.setUniforme(pb);
            break;
            case CAMILLERO: e.setUniforme(pa);
                break;
            case CIRUJANO: e.setUniforme(pv);
                break;
            case TSOCIAL: e.setUniforme(bb);
            break;
            default: e.setUniforme(ba);
            break;
        }
    }

}
