
public class RGBColorRunner {
	
	public static void main(String[] args)
	{
		RGBColor c1 = new RGBColor(55,80,200);
		c1.invert();
		System.out.println("After inversion" + "RGB = " + c1.getRed() + " " + c1.getGreen() + " " + c1.getBlue());
	}
	
	
}
