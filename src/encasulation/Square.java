package encasulation;

public class Square {
    public static void main(String[] args) {
    }
    private int side;

    public Square(int side) {
        this.side = side;
    }
    public int calculateArea() {
        if(side <= 0) {
            return -1;
    }
    return side * side;
}
public int calculatePerimeter() {
        if(side<=0) {
            return -1;
        }
        return 4 * side;
    }
}
