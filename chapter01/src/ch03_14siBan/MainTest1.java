package ch03_14siBan;

public class MainTest1 {

	// �����Լ�
	public static void main(String[] args) {
		
		// ���� ������ == '='
		// ������ �߿��� �켱 ������ ���� ���� ������
		int number = 10;
		// = (���� ������) : ���б�ȣ�� �޸� ������ ���� �����ϴ� �������Դϴ�.
		// ������ ������ �����ʿ��� �������� ������ �˴ϴ�.
		
		int number2 = number;
		// ������ ������ ������ ���� �ֽ��ϴ�.
		
		System.out.println(number);
		System.out.println(number2);
		System.out.println("=====================");
		
		
		// ��ȣ ������ ( +, -)
		// ��ȣ�� �����ϴ� �������Դϴ�. 
		// ��, ������ ����ִ� ���� ���� ������ ���´� �ƴմϴ�.
		
		System.out.println(-number);
		System.out.println("number�� ���� �� : " + number);
		
		number = -number;
		System.out.println(number);
		// ������ ���� ���� �����Ϸ��� ���� �����ڸ� �Բ� ����ؾ��Ѵ�.
		
		
		
		
	}//end of main

}// end of class