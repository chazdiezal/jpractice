
public class Car {
	
	private String color;
	private String brand;
	private int doors;
	//now we are going to create a constructor.  A constructor is a subroutine.  It is used to create an object.
	//Your instructor will explain the concept of constructor

	public Car (String mcolor, String mbrand, int mdoors)
	{
		color = mcolor;
		brand = mbrand;
		doors = mdoors;
	}
	public String toString()
		{
			return "Color: " + color + "Brand: " + brand + "Doors: " + doors;
		
}
}
