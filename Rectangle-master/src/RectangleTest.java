import java.awt.Rectangle;

public class RectangleTest {

	public static void main(String[] args)
	{
		//look in Rectangle API under constructors to find what Rectangle(5,10,20,30) does
		Rectangle box = new Rectangle(5, 10, 20, 30);
		//sets box with x,y,width,height dimensions
		
		//TODO Move the rectangle (use a method from the API to move the rectangle
		//                          by changing both the x and y coordinates)
		box.setLocation(6, 11);
		//TODO Print the following information in the following format
		/*
		 * Expected new x value: ... (print what you expect the x value to be)
		 * Actual x value: ...  (use a method from the API to print the actual x value)
		 * Expected new y value: ... (print what you expect the new y value to be)
		 * Actual y value: ...  (use a method from the API to print the actual y value)
		 */
		//6
		System.out.println(box.getX());
		//11
		System.out.print(box.getY());
	}

}
