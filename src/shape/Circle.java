package shape;

public class Circle extends Shape {
	
	int radius;
	
	Circle(int radius) {
		this.radius = radius; 
	}

	@Override
	double calculateArea() {
		return Math.PI * radius * radius;
	}

}
