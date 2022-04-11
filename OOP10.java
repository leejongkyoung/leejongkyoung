
class TheBase {
	String data1;
	void m1() {
		System.out.println("TheBase.m1");
	}
	
	void m3() {
		System.out.println("TheBase.m3");
	}
}

class TheDerived extends TheBase { // extends : ��� ( TheBase�� ��� ����� ���� )
	// 2-1. ����ϴ� Ŭ������ Ȯ��( ���ο� ��� �߰� )�ϰų� 
	void m2() {
		System.out.println("TheDerived.m2");		
	}
	
	// 2-2. ����( ���� �޼��� ���� )�� �����ؾ��Ѵ�. --> �޼��� ������, overriding
	void m3() { // ���� �޼����� ���´� �����ϰ�
		System.out.println("TheDerived.m3"); // ������ �ٸ���
	} // �޼��� ������
}

public class OOP10 {

	public static void main(String[] args) {
		// 1. TheDerived�� �������� �ʾ����� ��� �޾ұ� ������ m1() ��밡��
		TheDerived d1 = new TheDerived();	
		d1.m1();
		
		// 2.
		TheBase b2 = new TheBase();
		TheDerived d2 = new TheDerived();
		
		// 2-1.
		b2.m1();
     // b2.m2(); // �θ� Ŭ������ �ڽ� Ŭ������ ����� ��� �Ұ�				
		d2.m2();
		d2.m1(); // �ڽ� Ŭ������ �θ� Ŭ���� ��� ��� ����

		// 2-2.
		b2.m3(); // �θ� Ŭ������ m3() ���
		d2.m3(); // �ڽ� Ŭ������ m3() ��� ( �����ǵ� �޼��� ��� )
		 
		
			
		

	}

}
