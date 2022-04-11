class Constants { //필드영역
	
	int data1;
	final int DATA2 = 0;// final 변수는 값을 변경할 수 없는 변수 >> 상수 (초기화만 가능)
	final int DATA3;
	final int DATA4 = 0;
	static final int DATA5 = 0; //정적 final 변수 >> 반드시 필드 초기화 해야함 (생성자 초기화X)
	                            // final : 상수 , 대문자로 표기
	public Constants(){ //생성자 에서는 final 값을 넣을수있다.
		DATA3 = 0;
	//	DATA4 = 0; // final에 대해 필드 초기화와 생성자 초기화를 동시에 사용할 수 없습니다.
	//  DATA5 = 0; // static final은 생성자 초기화 X
		
	}
	
	void m() {
	//	data2 = 10; // final 형식으로 만든 변수는 값을 변경 할 수 없습니다.
	}
}


public class OOP09 {

	public static void main(String[] args) {
		
		int a = 10;
		a = 20;

	}

}
