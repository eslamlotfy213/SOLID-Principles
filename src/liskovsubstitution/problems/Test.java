package liskovsubstitution.problems;

public class Test {


    public static void main(String[] args) {

        Rectangle rectangle = new Square();  // problem here as rectangle 2 *  5 = 10 ,,,,     /// square  5 * 5
        rectangle.setWidth(2);
        rectangle.setHeight(5);

        if (rectangle.getArea()==10){
            System.out.println("Area : "+rectangle.getArea());
        }

    }
}
