package problem3;

/**
 * Created by fissehaye on 6/4/18.
 */
public class Driver {

    public static void main(String[] args){
        Figure[] figures = new Figure[5];

        Figure downwardHat1 = new DownwardHat();
        Figure downwardHat2 = new DownwardHat();
        Figure upwardHat = new UpwardHat();
        Figure faceMaker = new FaceMaker();
        Figure vertical = new Vertical();

        figures[0] = downwardHat1;
        figures[1] = downwardHat2;
        figures[2] = upwardHat;
        figures[3] = faceMaker;
        figures[4] = vertical;

        for (Figure figure : figures) {
            figure.getFigure();
        }

        System.out.println();

        for (Figure figure : figures) {
            System.out.print( figure.getClass().getSimpleName() + " : ");
            figure.getFigure();
            System.out.println();
        }
    }
}
