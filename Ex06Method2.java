import java.util.Scanner;

public class Ex06Method2 {

	public static void main(String[] args) {

		java.util.Scanner scanner = new java.util.Scanner(System.in);

		// 1. 사용자 입력 : 박스 그리기에 사용할 문자
		System.out.println("박스 그리기에 사용할 문자 입력 : ");
		String s = scanner.next();
		// 2. 사용자 입력 : 박스의 너비
		System.out.println("박스의 너비 : ");
		int width = scanner.nextInt();
		// 2. 사용자 입력 : 박스의 높이
		System.out.println("박스의 높이 : ");
		int height = scanner.nextInt();

		drawBox(s, width, height);

	}
								// 전달 인자, parameter, 인자
	private static void drawBox(String s, int width, int height) {
		for (int i = 0; i < height; i++) {
			for (int i1 = 0; i1 < width; i1++) {
				if (i1 == 0 || i1 == width - 1 || i == 0 || i == height - 1) {
					System.out.print(s);// "●"
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	} // drawBox end

}
