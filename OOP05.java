
class Person5 {

	private String name;
	private String phone;
	private String email;

	// ������ �޼��� ( constructor ) : �ν��Ͻ� �ʱ�ȭ ����
	// 1. ���� : ����� X, �̸��� Ŭ���� �̸��� ����
	public Person5() {
		System.out.println("�������� ���� ������ �޼���");
	}
	// 2. instance�� ��������� (new) �ڵ� ȣ��
	// 3. overloading ���� : �������ڸ� �ٸ��� �ؼ� �������� ������ �޼��� ������ �� �ֽ��ϴ�.
	public Person5(String name, String phone, String email) {
		System.out.println("�������� �ִ� ������ �޼���");
		this.name = name;	// �������ڷ� �ν��Ͻ� ����� �� �ʱ�ȭ
		this.phone = phone;
		this.email = email;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name.length() == 0) {
			System.out.println("�̸��� �� ���ڿ��� �� �����ϴ�.");
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
			this.phone = "�ڵ��� ��ȣ�� �Է��Ͻÿ�.";
			return;
		}
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		if (email.length() == 0) {
			this.email = "������ �Է��Ͻÿ�.";
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
		int[] ar = { 1, 2, 3, 4, 5 }; // �ʱ�ȭ ( �迭�� ����鼭 �� ���� )

		// �ν��Ͻ� �ʱ�ȭ �ϴ� ��
		// �ڹٰ� �����ϴ� �ʱ�ȭ ����.
		
		// �������� ���� ������ �޼��� ȣ��
		Person5 p = new Person5();
		
		// �������� �ִ� ������ �޼��� ȣ��
		Person5 p2 = new Person5("�嵿��","010 2430 1313","jdk@naver.com");
		System.out.println(p2.info());
		


	}

}