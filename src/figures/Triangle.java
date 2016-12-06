package figures;

public class Triangle extends Figure {

    @Override
    public double calculationOfArea(){
        return  ((Math.sqrt(3)*Math.pow(size,2))/4);
    }
}
