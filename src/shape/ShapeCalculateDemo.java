package shape;

public class ShapeCalculateDemo {
	public static void main(String[] args) {
		ShapeCalculator shapeCalculator = new ShapeCalculator();

		Shape shape1 = new Rectangle(10, 20);
		shapeCalculator.printArea(shape1);

		Shape shape2 = new Circle(10);
		shapeCalculator.printArea(shape2);

		Shape shape3 = new Triangle(10, 20);
		shapeCalculator.printArea(shape3);
	}
}
