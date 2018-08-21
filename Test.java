
public class Test {
	
	public static void main(String[] args) {
		
		Shape s = new Shape();
		Circle c = new Circle();
		Square sq = new Square();
		Triangle t = new Triangle();
		c.radius = 8;
		s.calculateArea();
		c.calculateArea();
		c.calculateCircumference();
		c.draw();
		s.calculateArea();
		sq.calculateArea();
		t.calculateArea();
		
	
		
		}
		
	
	}

