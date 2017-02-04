/*Anthony Castro
 * This arm class will be used to make robotic arms
 * These arms will be used to simulate a 3R arm.
 * 
 */



public class Arm 
{
	//Each arm has an x and y coordinate in a plane where the base is.
	int x ;
	int y ;
	//Next the arm has a length
	int length ;
	//The arm will also make an angle with the horizontal
	int angle ;
	

	//Start of constructor
	public void Arm(int x, int y, int length, int angle)
	{

		this.x = x;
		this.y = y ;
		this.length = length ;
		this.angle = angle ;
		
		
	}
	//End of constructor
	
	
	
	//Next, I will made methods to locate where
	//the ends of x and y are located in reference to the
	//base of the arm.
	
	
	
	//Start of getXEnd method
	public double getXEnd()
	{
		//The x length will be calculated
		//using the base x location and 
		//the length times the angle of the arm.
		return this.x +( this.length*Math.cos(this.angle)) ;
		
		
	}
	//End of the getXLength method
	
	
	
	//Start of the getYEnd method
	public double getYEnd()
	{
		//Similarly, this will be calculated using
		//the y position and the length times the sin of the angle
		return this.y + (this.length*Math.sin(this.angle)) ;
		
	}
	
	
	
	
}
//End of the Arm class
