class Person2 {

	String name;
	String phone;
	String email;

	String info() {


		String s = String.format("[%s][%s][%s]", name, phone, email);
		return s;
	}
}

public class Ex02OOP02 {

	public static void main(String[] args) {
		
		int a = 10;
		int b = a;
		System.out.printf("[%d][%d]\n", a, b);
		b = 20;
		System.out.printf("[%d][%d]\n", a, b);
		
		Person2 p1 = new Person2();
		p1.name = "Na Kyoung";
		p1.phone = "010 9568 6421";
		p1.email = "cherry_nk@naver.com";
		
		Person2 p2 = p1;  //���������� ����� �ּ� ���� >> �� ���� ������ ���� �ν��Ͻ��� ����
		p2.name = "Jun";  //���� �ּҸ� �����ϱ⶧���� p2�� �ν��Ͻ��� �����ϸ� p1�� ������ �޴´�.
		p2.phone = "010 8608 9508";
		p2.email = "juns1986@naver.com";
	
		System.out.println(p1.info());
		
	

	}

}
