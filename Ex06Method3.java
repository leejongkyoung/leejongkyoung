
public class Ex06Method3 {
	public static void main(String[] args) { //return ���� ���� ��
				
		double resulte = add(10, 20); //�������ڰ� 2���� add ȣ��
		System.out.println(resulte);
		
		resulte = add(10, 20, 30); //�������ڰ� 3���� add ȣ��
		System.out.println(resulte);
		
		}
         //______return�ϸ� �����ϴ� �ڷ����� �˷�����Ѵ�.
	static double add(double n1, double n2) {
		double result = n1 + n2;
		
		return result; // �Լ� ���� + result �� ȣ���� ������ ��ȯ
	}
	
	     //�޼��� �����ε� : �̸��� ������ ���������� �ڷ���, ����, (�ڷ���)���� ���� ����ؼ� �ٸ� �Լ��� �����ϴ� ���
	static double add(double n1, double n2, double n3) {
		double result = n1 + n2 + n3;
		
		return result; // �Լ� ���� + result �� ȣ���� ������ ��ȯ
	}
}
