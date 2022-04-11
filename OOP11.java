
class TheBase2 {
	String data1;

	void m1() {
		System.out.println("TheBase.m1");
	}

	void m3() {
		System.out.println("TheBase.m3");
	}
}

class TheDerived2 extends TheBase2 { // extends : ��� ( TheBase�� ��� ����� ���� )
	// 2-1. ����ϴ� Ŭ������ Ȯ��( ���ο� ��� �߰� )�ϰų�
	void m2() {
		System.out.println("TheDerived.m2");
	}

	// 2-2. ����( ���� �޼��� ���� )�� �����ؾ��Ѵ�. --> �޼��� ������, overriding
	void m3() { // ���� �޼����� ���´� �����ϰ�
		System.out.println("TheDerived.m3"); // ������ �ٸ���
	} // �޼��� ������
}

public class OOP11 {

	public static void main(String[] args) {
		
		//TheBase b1 = new TheBase(); // �Ϲ����� ��� ���� ( ���� == �ν��Ͻ� )
		// 1. ��� ������ Ŭ���� ������ ����ȯ ���� ( ���� Ÿ�԰� �ν��Ͻ� Ÿ���� �ٸ� �� �ִ�. )			
		TheBase2 b1 = new TheDerived2();// ������ �θ��� ���� -> �ڽ� �ν��Ͻ� ���¸� ����
		// TheDerived d1 = (TheDerived)new TheBase();// �ڽ� ���� -> �θ� �ν��Ͻ� ���� �Ұ� ( ���� ����ȯ )
		              // (���� ����ȯ)
		TheDerived2 d1_1 = (TheDerived2)b1;				
		
		//////////////////////////////////
		
		// 2. ���� Ÿ�԰� �ν��Ͻ� Ÿ���� �ٸ� �� �����ǵ� �޼����� ȣ�� ������ ������ �ν��Ͻ� Ÿ�� ����
		TheBase2 b2 = new TheDerived2();
		b2.m3(); // �����ǵ� �޼��� m3 ȣ�� �����?
		
		System.out.println("End of Program");
	}

}
