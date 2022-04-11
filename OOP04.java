
class ThePoint{
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
	//String loc = "" + x +"/" + y;
	String loc = String.format("[%.2f][%.2f]", x, y);
	return loc;
	
	
		
	}
}
public class OOP04 {
	public static void main(String[] args) {
		ThePoint thePoint = new ThePoint();
		thePoint.setX(10.344);
		thePoint.setY(30.555);
		
		String loc = thePoint.location();
		System.out.println(loc);
	}
	

}
