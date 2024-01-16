package liskovsubstitution.solution;

public class Square implements Shape{

    private int size;


    public void setSize(int size) {
        this.size = size;
    }


    @Override
    public int area() {
     return size * size;
    }
}
