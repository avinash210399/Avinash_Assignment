package assignment2;

public class Shapes{
	public abstract class Shape {
}

	public Shapes() {
		// TODO Auto-generated constructor stub
	}
	abstract void draw();

}
class Line extends Shapes{

	@Override
	void draw() {
		System.out.println("Drawing a line");
	}
	
}
class Rectangle extends Shapes{

	@Override
	void draw() {
		System.out.println("Drawing a rectangle");
	}
	
}
class Cube extends Shapes{

	@Override
	void draw() {
		System.out.println("Drawing a cube");
	}
}
