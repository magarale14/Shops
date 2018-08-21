
public class Triangle extends Shape {
	 public int height;
	 public int base;
	 
	 @Override
	 public void calculateArea(){
			//Accessing Math's triangle area value
		 double area=(base*height)/2;
		 	System.out.println("Area of a triange is " + area);
}
}