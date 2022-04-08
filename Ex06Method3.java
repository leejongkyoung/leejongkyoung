
public class Ex06Method3 {
	public static void main(String[] args) { //return 값이 오는 곳
				
		double resulte = add(10, 20); //전달인자가 2개인 add 호출
		System.out.println(resulte);
		
		resulte = add(10, 20, 30); //전달인자가 3개인 add 호출
		System.out.println(resulte);
		
		}
         //______return하면 리턴하는 자료형을 알려줘야한다.
	static double add(double n1, double n2) {
		double result = n1 + n2;
		
		return result; // 함수 종료 + result 를 호줄한 곳으로 반환
	}
	
	     //메서드 오버로딩 : 이름이 같지만 전달인자의 자료형, 갯수, (자료형)순서 등을 고려해서 다른 함수로 구분하는 기법
	static double add(double n1, double n2, double n3) {
		double result = n1 + n2 + n3;
		
		return result; // 함수 종료 + result 를 호줄한 곳으로 반환
	}
}
