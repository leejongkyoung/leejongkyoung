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
		
		Person2 p2 = p1;  //참조변수의 복사는 주소 복사 >> 두 참조 변수는 같은 인스턴스를 참조
		p2.name = "Jun";  //같은 주소를 참조하기때문에 p2로 인스턴스를 조작하면 p1도 영향을 받는다.
		p2.phone = "010 8608 9508";
		p2.email = "juns1986@naver.com";
	
		System.out.println(p1.info());
		
	

	}

}
