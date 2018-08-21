
public class Circle extends Shape {

		public int radius;
		
		@Override //This is an annotation
		public void calculateArea(){
			//Accessing Math's PI value
			double area = Math.PI * (Math.pow(radius,2));
			System.out.println("Area of a circle is " + area);
			
		}
					
		public void calculateCircumference(){
				double circumference = (2*Math.PI*radius);
				System.out.println("Area of a circumference is " + circumference);
			}
			
		@Override
		public void draw(){
			System.out.println("Draw Circle");
		}
		} 

