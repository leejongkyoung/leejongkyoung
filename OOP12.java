
class Shape {
	void draw() {
		System.out.println("Shape.draw");
	}
}

class Oval extends Shape {
	void draw() {
		System.out.println("Oval.draw");
	}
}

class Rectangle extends Shape {
	void draw() {
		System.out.println("Rectangle.draw");
	}
}

class Line extends Shape {
	void draw() {
		System.out.println("Line.draw");
	}
}

public class OOP12 {

	public static void main(String[] args) {

		// 1. Oval 5��, Rectangle 5��, Line 5�� ���
		// Oval, Line, Rectangle ��θ� ������ �� �ִ� �迭�� ���� ���
		Shape[] shapes = new Shape[15]; // Shape �迭�� Rectangle, Line, Oval ��� ���� ����
		for (int i = 0; i < shapes.length; i++) {
			switch (i % 3) {
			case 0: shapes[i] = new Oval();	break;
			case 1: shapes[i] = new Rectangle();break;
			case 2: shapes[i] = new Line();	break;
			}
		}
	//   for (int i = 0; i < shapes.length; i++) {
	//		shapes[i].draw();
	//	}
		
		for (Shape s : shapes) { // shapes �迭�� ���� ���������� �ϳ��� ������ �ݺ� ����
			s.draw(); // ������ �ڵ������� �����ϴ� �ν��Ͻ��� ���� �ٸ� �޼��� ȣ��
		}

	}

}

// ������ ( Polymorphism )
// 1. ������ �ڵ尡 ��Ȳ�� ���� ( �����ϴ� �ν��Ͻ��� ���� ) �ٸ��� �����ϴ� ����
// 2. ��Ӱ����� Ŭ�������� ����Ÿ�԰� �ν��Ͻ�Ÿ���� �ٸ���, �����ǵ� �޼��� ȣ���� �ν��Ͻ� Ÿ���� ������ ���