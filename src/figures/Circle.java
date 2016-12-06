package figures;

public class Circle extends Figure {

    @Override
    public double calculationOfArea(){
        return 3.14 * Math.pow(size,2);
    }
}
