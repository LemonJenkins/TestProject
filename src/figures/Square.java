package figures;

public class Square extends Figure {

    @Override
    public double calculationOfArea(){
        return  Math.pow(size,2);
    }
}
