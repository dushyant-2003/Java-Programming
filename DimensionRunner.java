package introductionOOPS;

public class DimensionRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dimension obj   = new Dimension(70);
		int feet = obj.getFeet();
		int inches = obj.getInches();
		System.out.println("Feet = " + feet);
		System.out.println("Inches = " + inches);
	}

}
