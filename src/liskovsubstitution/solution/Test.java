package liskovsubstitution.solution;

public class Test {

    public static void main(String[] args) {


        Rectangle rectangle = new Rectangle();
        rectangle.setHeight(2);
        rectangle.setWidth(5);
        System.out.println(rectangle.area());




        Square square = new Square();
        square.setSize(4);
        System.out.println(square.area());


    }
}
