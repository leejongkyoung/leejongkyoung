

public class Ex06Method1 { // �ڵ带 �޼���� ����� ȣ���ϱ� (���� ���� �ʰ� ����)
							// �ڵ带 ���� ������ �����ϴ� �۾� refactoring[�����丵]
	public static void main(String[] args) {
		{ //�߰�ȣ�� ������ �����.
			int a = 10;
			a = 20;
			{
				a = 30; // ������ ���� �� ���� ���������� ��밡��
				int b = 40;
			}
		}	//������ ������ ��� �������� ��� �ȵ�
		
		drawBox(); // �Լ� ȣ�� : �Լ��� �ҷ��� �����ϱ� ����� ���

	}
	//�Լ� ���� or ���� : �Լ� ����� (Method)
	private static void drawBox() {
		for (int i = 0; i < 10; i++) {
			for (int i1 = 0; i1 < 20; i1++) {
				if (i1 == 0 || i1 == 20 - 1 || i == 0 || i == 10 - 1) {
					System.out.print("��");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	} //drawBox end

}
