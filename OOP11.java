
class TheBase2 {
	String data1;

	void m1() {
		System.out.println("TheBase.m1");
	}

	void m3() {
		System.out.println("TheBase.m3");
	}
}

class TheDerived2 extends TheBase2 { // extends : 상속 ( TheBase의 모든 멤버를 포함 )
	// 2-1. 상속하는 클래스는 확장( 새로운 멤버 추가 )하거나
	void m2() {
		System.out.println("TheDerived.m2");
	}

	// 2-2. 변경( 기존 메서드 수정 )을 포함해야한다. --> 메서드 재정의, overriding
	void m3() { // 기존 메서드의 형태는 동일하게
		System.out.println("TheDerived.m3"); // 내용은 다르게
	} // 메서드 재정의
}

public class OOP11 {

	public static void main(String[] args) {
		
		//TheBase b1 = new TheBase(); // 일반적인 사용 형태 ( 참조 == 인스턴스 )
		// 1. 상속 관계의 클래스 사이의 형변환 가능 ( 참조 타입과 인스턴스 타입이 다를 수 있다. )			
		TheBase2 b1 = new TheDerived2();// 언제나 부모의 참조 -> 자식 인스턴스 형태만 가능
		// TheDerived d1 = (TheDerived)new TheBase();// 자식 참조 -> 부모 인스턴스 형태 불가 ( 강제 형변환 )
		              // (강제 형변환)
		TheDerived2 d1_1 = (TheDerived2)b1;				
		
		//////////////////////////////////
		
		// 2. 참조 타입과 인스턴스 타입이 다를 때 재정의된 메서드의 호출 기준은 언제나 인스턴스 타입 기준
		TheBase2 b2 = new TheDerived2();
		b2.m3(); // 재정의된 메서드 m3 호출 결과는?
		
		System.out.println("End of Program");
	}

}
