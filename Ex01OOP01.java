
public class Ex01OOP01 {

	public static void main(String[] args) {

		Person person = null; // Person Ÿ���� ���� ����
		person = new Person(); // Person Ÿ���� �ν��Ͻ� ����� + ���� ������ �ּ�(����) ����
		// Person person2 = new Person(); // ���� ���� �����

		person.name = "Jong Kyoung";
		person.phone = "010 2430 1345";
		person.email = "shhtjk000@naver.com";

		String personInfo = person.info();
		System.out.println(personInfo);

		Person person2 = new Person(); // ���� ���� �����

		person2.name = "Na Kyoung";
		person2.phone = "010 9568 6421";
		person2.email = "cherry_nk@naver.com";

		String person2Info = person2.info();
		System.out.println(person2Info);

	}

}
