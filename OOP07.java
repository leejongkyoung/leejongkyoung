
class MyClass {
	int data1;
	int data2;     // 인스턴스형 변수 : new 할때 마다 새로 만들어지는 변수
	
	static int data3; // 클래스형 변수 : 한번만 만들어져서 모든 인스턴스가 공유하는 변수
	static void staticMethod() {
		System.out.println("this is static method.");
		// static 메서드 안에서 인스턴스형 멤버 사용할 수 없음.
		
		
	}
}

public class OOP07 {

	public static void main(String[] args) {

		MyClass obj1 = new MyClass();

		obj1.data1 = 100;
		obj1.data2 = 200;
		MyClass.data3 = 500;
		
		MyClass obj2 = new MyClass();

		obj2.data1 = 900;
		obj2.data2 = 800;
		MyClass.data3 = 600;
		
		System.out.println("obj1.data1 = "+ obj1.data1);
		System.out.println("obj2.data2 = "+ obj2.data1);
		System.out.println("obj1.data3 = "+ MyClass.data3);
		System.out.println("obj2.data3 = "+ MyClass.data3);

		System.out.println("MyClass.data3 = " + MyClass.data3);
		MyClass.staticMethod();
	}

}
