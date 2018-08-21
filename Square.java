
public class Square extends Shape {
	 public int side;
	 
	    		
	
	    @Override
	 	 public void calculateArea(){
			//Accessing Math's square area value
	    
			double area = Math.pow(side,2);
			System.out.println("Area of a circle is " + area);
	 	 }
		
}


