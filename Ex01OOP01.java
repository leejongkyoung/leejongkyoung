
public class Ex01OOP01 {

	public static void main(String[] args) {

		Person person = null; // Person 타입의 참조 변수
		person = new Person(); // Person 타입의 인스턴스 만들기 + 참조 변수에 주소(참조) 저장
		// Person person2 = new Person(); // 참조 변수 만들기

		person.name = "Jong Kyoung";
		person.phone = "010 2430 1345";
		person.email = "shhtjk000@naver.com";

		String personInfo = person.info();
		System.out.println(personInfo);

		Person person2 = new Person(); // 참조 변수 만들기

		person2.name = "Na Kyoung";
		person2.phone = "010 9568 6421";
		person2.email = "cherry_nk@naver.com";

		String person2Info = person2.info();
		System.out.println(person2Info);

	}

}
