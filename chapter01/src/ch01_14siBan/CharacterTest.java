package ch01_14siBan;

public class CharacterTest {
	
	public static void main(String[] args) {
	
		char ch1 = 'A'; // ������ 65 ����
		System.out.println(ch1);
		System.out.println((int)ch1);
		
		
		char ch2 = 66;	// 'A','C'
		System.out.println(ch2);
		System.out.println((int)ch2);
		
		char ch3 = 67;
		System.out.println(ch3);
		System.out.println((int)ch3);

		// ����!!! ������ ���� �Ұ�
		
		// char ch4 = -68;
	
		// ���� 
		// 1. ��, ��, ��, ��, �� ----> ���� ������ �� �ΰ���?
		
		char ch4 = '��';
		char ch5 = '��';
		char ch6 = '��';
		char ch7 = '��';
		char ch8 = '��';
		
		System.out.println((int)ch4);
		System.out.println((int)ch5);
		System.out.println((int)ch6);
		System.out.println((int)ch7);
		System.out.println((int)ch8);
		
		System.out.println((int)'��');	
		
		
		
		
	}

}