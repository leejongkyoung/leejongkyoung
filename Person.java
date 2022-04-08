
//           int와 같은 자료형을 만드는것 
public class Person {

	// 1. 특성 ( Data, 변수 --> 필드 )
	
	String name;
	String phone;
	String email;
	// 2. 기능 ( Method )
	String info() {		
		//return "[" + name + "][" + phone + "][" + email +"]";
		String s = "[" + name + "][" + phone + "][" + email +"]";
		return s;
	}
	
	
	// 클래스(설계도) 클래스는 만드는 것 만으로는 어떤 실행도 이루워 지지 않는다.
}
