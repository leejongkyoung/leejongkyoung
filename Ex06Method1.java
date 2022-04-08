

public class Ex06Method1 { // 코드를 메서드로 만들어 호출하기 (복사 하지 않고 재사용)
							// 코드를 좋은 쪽으로 개선하는 작업 refactoring[리팩토링]
	public static void main(String[] args) {
		{ //중괄호는 영역을 만든다.
			int a = 10;
			a = 20;
			{
				a = 30; // 변수가 선언 된 하위 영역에서는 사용가능
				int b = 40;
			}
		}	//변수가 영역을 벗어난 곳에서는 사용 안됨
		
		drawBox(); // 함수 호출 : 함수를 불러서 실행하기 만드는 명령

	}
	//함수 선언 or 정의 : 함수 만들기 (Method)
	private static void drawBox() {
		for (int i = 0; i < 10; i++) {
			for (int i1 = 0; i1 < 20; i1++) {
				if (i1 == 0 || i1 == 20 - 1 || i == 0 || i == 10 - 1) {
					System.out.print("●");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	} //drawBox end

}
