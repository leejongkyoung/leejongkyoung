//Ŭ������ ���(�����ڿ�, Ư�� ����)�� �ܺο��� ���� �������� ���ϵ��� ���ƾ� �Ѵ�.
// ���������ڸ� ����ؼ� ���� (public : ���� ����,  private: ���ο����� ���� ���� )
class Person3 {

	private String name;
	private String phone;
	private String email;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name.length() == 0) {
			System.out.println("�̸��� �� ���ڿ��� �� �����ϴ�.");
			this.name = "Invalid Name";
			return;
		}
		this.name = name; // this. :  Ŭ������ ����� ǥ���ϱ� ���� ����ϴ� Ű����
	}
	public String getPhone() {
		return phone;
	}	
	public void setPhone(String phone) {
		if(phone.length() == 0) {
			this.phone = "�ڵ��� ��ȣ�� �Է��Ͻÿ�.";
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
		p.setName(""); //�ܺ����� : private ����� ���� �ܺ� ������ ����
		p.setPhone("");
		p.setEmail("jdk@naver.com");
		
		System.out.println(p.info());
		
	}

}