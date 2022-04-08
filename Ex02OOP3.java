//클래스의 멤버(내부자원, 특히 변수)는 외부에서 직접 접근하지 못하도록 막아야 한다.
// 접근지정자를 사용해서 관리 (public : 제한 없음,  private: 내부에서만 접근 가능 )
class Person3 {

	private String name;
	private String phone;
	private String email;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name.length() == 0) {
			System.out.println("이름은 빈 문자열일 수 없습니다.");
			this.name = "Invalid Name";
			return;
		}
		this.name = name; // this. :  클래스의 멤버를 표시하기 위해 사용하는 키워드
	}
	public String getPhone() {
		return phone;
	}	
	public void setPhone(String phone) {
		if(phone.length() == 0) {
			this.phone = "핸드폰 번호를 입력하시오.";
			return;
		} 
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String info() {
		String s = String.format("[%s][%s][%s]", name, phone, email);
		return s;
	}
}

public class Ex02OOP3 {
	public static void main(String[] args) {
		Person3 p = new Person3();
		p.setName(""); //외부접근 : private 멤버에 대한 외부 접근은 오류
		p.setPhone("");
		p.setEmail("jdk@naver.com");
		
		System.out.println(p.info());
		
	}

}