import java.util.Scanner;

public class Ex06Method2 {

	public static void main(String[] args) {

		java.util.Scanner scanner = new java.util.Scanner(System.in);

		// 1. ����� �Է� : �ڽ� �׸��⿡ ����� ����
		System.out.println("�ڽ� �׸��⿡ ����� ���� �Է� : ");
		String s = scanner.next();
		// 2. ����� �Է� : �ڽ��� �ʺ�
		System.out.println("�ڽ��� �ʺ� : ");
		int width = scanner.nextInt();
		// 2. ����� �Է� : �ڽ��� ����
		System.out.println("�ڽ��� ���� : ");
		int height = scanner.nextInt();

		drawBox(s, width, height);

	}
								// ���� ����, parameter, ����
	private static void drawBox(String s, int width, int height) {
		for (int i = 0; i < height; i++) {
			for (int i1 = 0; i1 < width; i1++) {
				if (i1 == 0 || i1 == width - 1 || i == 0 || i == height - 1) {
					System.out.print(s);// "��"
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	} // drawBox end

}
