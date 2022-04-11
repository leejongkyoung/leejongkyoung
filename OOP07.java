
class MyClass {
	int data1;
	int data2;     // �ν��Ͻ��� ���� : new �Ҷ� ���� ���� ��������� ����
	
	static int data3; // Ŭ������ ���� : �ѹ��� ��������� ��� �ν��Ͻ��� �����ϴ� ����
	static void staticMethod() {
		System.out.println("this is static method.");
		// static �޼��� �ȿ��� �ν��Ͻ��� ��� ����� �� ����.
		
		
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
