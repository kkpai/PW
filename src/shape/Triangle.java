package shape;

public class Triangle extends Shape {
	
	int base;
	int height;
	
	Triangle(int base, int height) {
		this.base = base;
		this .height = height; 
	}

	@Override
	double calculateArea() {
		return 0.5 * this.base * this.height;
	}

}
