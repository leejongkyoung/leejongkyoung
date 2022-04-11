
class ThePoint2 {
	private double x;
	private double y;

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	String location() {

		String loc = String.format("[%.2f][%.2f]", x, y);
		return loc;
	}

	public ThePoint2() {
	System.out.println("constructor with no arg");
}
	public ThePoint2(double x, double y) {
	System.out.println("constructor with no 2 args");
	this.x = x;
	this.y = y;
		
	}

}

public class OOP06 {
	public static void main(String[] args) {
		ThePoint2 x = new ThePoint2();
		
		ThePoint2 x2 = new ThePoint2(80.156,745);
		System.out.println(x2.location());
		
	}

}
