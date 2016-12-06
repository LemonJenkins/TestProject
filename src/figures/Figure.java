package figures;

public class Figure {

    public int[] coordinates = new int[3];
    public int size;

    public void displacement(int[] mouvdCoordinate ){
    mouvdCoordinate[0] = coordinates[0];
    mouvdCoordinate[1] = coordinates[1];
    mouvdCoordinate[2] = coordinates[2];
    }

    public double calculationOfArea (){
        return 0;
    }

    public void changeOfSize(int size){
    this.size = size;
    }
}
