
class TheBase {
	String data1;
	void m1() {
		System.out.println("TheBase.m1");
	}
	
	void m3() {
		System.out.println("TheBase.m3");
	}
}

class TheDerived extends TheBase { // extends : 상속 ( TheBase의 모든 멤버를 포함 )
	// 2-1. 상속하는 클래스는 확장( 새로운 멤버 추가 )하거나 
	void m2() {
		System.out.println("TheDerived.m2");		
	}
	
	// 2-2. 변경( 기존 메서드 수정 )을 포함해야한다. --> 메서드 재정의, overriding
	void m3() { // 기존 메서드의 형태는 동일하게
		System.out.println("TheDerived.m3"); // 내용은 다르게
	} // 메서드 재정의
}

public class OOP10 {

	public static void main(String[] args) {
		// 1. TheDerived에 정의하지 않았지만 상속 받았기 때문에 m1() 사용가능
		TheDerived d1 = new TheDerived();	
		d1.m1();
		
		// 2.
		TheBase b2 = new TheBase();
		TheDerived d2 = new TheDerived();
		
		// 2-1.
		b2.m1();
     // b2.m2(); // 부모 클래스는 자식 클래스의 멤버를 사용 불가				
		d2.m2();
		d2.m1(); // 자식 클래스는 부모 클래스 멤버 사용 가능

		// 2-2.
		b2.m3(); // 부모 클래스의 m3() 사용
		d2.m3(); // 자식 클래스의 m3() 사용 ( 재정의된 메서드 사용 )
		 
		
			
		

	}

}
