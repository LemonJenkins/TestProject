import static com.Nixsolutions.testSortArray;

import figures.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        //testSortArray();

    }

    public static void task3() {
        ArrayList<Figure> figresMass = new ArrayList<>();
        Random forGenRandommNumbers = new Random(System.nanoTime());
        int randomNumber = 0;
        for (int i = 0; i < 11; i++) {
            randomNumber = forGenRandommNumbers.nextInt(2);
            if (randomNumber == 0) {
                figresMass.add(i, new Circle());
            } else {
                if (randomNumber == 1) {
                    figresMass.add(i, new Square());
                } else {
                    figresMass.add(i, new Triangle());
                }
            }
            figresMass.get(i).changeOfSize(forGenRandommNumbers.nextInt(20));
            figresMass.get(i).calculationOfArea();
        }
        System.arraycopy(sortt(figresMass), 0, figresMass, 0, figresMass.size());
    }

    public static ArrayList<Figure> sortt(ArrayList<Figure> list) {
        list.sort(new Comparator<Figure>() {
            @Override
            public int compare(Figure o1, Figure o2) {
                if (o1.size > o2.size) {
                    return 1;
                } else {
                    if (o1.size == o2.size) {
                        return 0;
                    } else {
                        return -1;
                    }
                }
            }
        });
        return list;
    }

}
