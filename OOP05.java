
class Person5 {

	private String name;
	private String phone;
	private String email;

	// 생성자 메서드 ( constructor ) : 인스턴스 초기화 도구
	// 1. 형식 : 결과형 X, 이름이 클래스 이름과 동일
	public Person5() {
		System.out.println("전달인자 없는 생성자 메서드");
	}
	// 2. instance가 만들어질때 (new) 자동 호출
	// 3. overloading 가능 : 전달인자를 다르게 해서 여러개의 생성자 메서드 정의할 수 있습니다.
	public Person5(String name, String phone, String email) {
		System.out.println("전달인자 있는 생성자 메서드");
		this.name = name;	// 전달인자로 인스턴스 멤버의 값 초기화
		this.phone = phone;
		this.email = email;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name.length() == 0) {
			System.out.println("이름은 빈 문자열일 수 없습니다.");
			this.name = "Invalid Name";
			return;
		}
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		if (phone.length() == 0) {
			this.phone = "핸드폰 번호를 입력하시오.";
			return;
		}
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		if (email.length() == 0) {
			this.email = "메일을 입력하시오.";
			return;
		}

		this.email = email;
	}

	public String info() {
		String s = String.format("[%s][%s][%s]", name, phone, email);
		return s;
	}
}

public class OOP05 {
	public static void main(String[] args) {
		int x = 10;
		int[] ar = { 1, 2, 3, 4, 5 }; // 초기화 ( 배열을 만들면서 값 저장 )

		// 인스턴스 초기화 하는 법
		// 자바가 지원하는 초기화 문법.
		
		// 전달인자 없는 생성자 메서드 호출
		Person5 p = new Person5();
		
		// 전달인자 있는 생성자 메서드 호출
		Person5 p2 = new Person5("장동건","010 2430 1313","jdk@naver.com");
		System.out.println(p2.info());
		


	}

}