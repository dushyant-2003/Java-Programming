package introductionOOPS;

public class Square {

    private int side;

    public Square(int side) {
        this.side = side;
    }

    public int calculateArea() {
        if(side <=0 )
        {
            return -1;
        }
        return side*side;
    }

    public int calculatePerimeter() {
        // TODO: Calculate and return the perimeter of the square
        if(side<= 0)
        {
            return -1;
        }
        return 4*side;
    }

}