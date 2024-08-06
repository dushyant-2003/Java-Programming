
//RGBColor class representing a color using Red Green Blue (RGB) model.
public class RGBColor {
 
 // The Red, Green, Blue color values range from 0 to 255.
 private int red;
 private int green;
 private int blue;

 // Constructor for RGBColor class which initializes the color with provided red, green and blue values.
 public RGBColor(int red, int green, int blue) {
     // write your code here
     this.red = red;
     this.green = green;
     this.blue = blue;
 }

 // Getter method to get the red value of the color.
 public int getRed() {
     // write your code here
     return red;
 }

 // Getter method to get the green value of the color.
 public int getGreen() {
     // write your code here
     return green;
 }

 // Getter method to get the blue value of the color.
 public int getBlue() {
     return blue;
 }

 // Method to invert the color. The inversion is done by subtracting each color component from 255.
 public void invert() {
     // write your code here
 red = 255 -red;
 green = 255 -green;
 blue = 255 - blue;
     
 }
}