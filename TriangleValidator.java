package introductionOOPS;

public class TriangleValidator {
    public boolean isValidTriangle(int angle1, int angle2, int angle3) {
        
        if(angle1 <=0 || angle2 <= 0 || angle3 <= 0)
        {
            return false;
        }
        
        if(angle1 + angle2 + angle3 == 180)
        {
            return true;
        }
        
        
        return false;
    }
    
    public boolean isRightAngled(int side1, int side2, int side3) {
        // write your code
        if(side1 <= 0 || side2 <=0 || side3 <= 0)
        {
            return false;
        }
        if(side1 * side1 + side2 * side2 == side3*side3 ||
        side1 * side1 + side3 * side3 == side2*side2 ||
        side2 * side2 + side3 * side3 == side1*side1)
        return true;
        
        
        return false;
    }
}
