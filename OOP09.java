class Constants { //�ʵ念��
	
	int data1;
	final int DATA2 = 0;// final ������ ���� ������ �� ���� ���� >> ��� (�ʱ�ȭ�� ����)
	final int DATA3;
	final int DATA4 = 0;
	static final int DATA5 = 0; //���� final ���� >> �ݵ�� �ʵ� �ʱ�ȭ �ؾ��� (������ �ʱ�ȭX)
	                            // final : ��� , �빮�ڷ� ǥ��
	public Constants(){ //������ ������ final ���� �������ִ�.
		DATA3 = 0;
	//	DATA4 = 0; // final�� ���� �ʵ� �ʱ�ȭ�� ������ �ʱ�ȭ�� ���ÿ� ����� �� �����ϴ�.
	//  DATA5 = 0; // static final�� ������ �ʱ�ȭ X
		
	}
	
	void m() {
	//	data2 = 10; // final �������� ���� ������ ���� ���� �� �� �����ϴ�.
	}
}


public class OOP09 {

	public static void main(String[] args) {
		
		int a = 10;
		a = 20;

	}

}
