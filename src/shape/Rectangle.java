package shape;

public class Rectangle extends Shape {
	
	int length;
	int breadth;
	
	Rectangle(int length, int breadth) {
		this.length = length;
		this .breadth = breadth; 
	}

	@Override
	double calculateArea() {
		return this.length * this.breadth;
	}

}
