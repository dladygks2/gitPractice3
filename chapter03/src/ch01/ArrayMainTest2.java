package ch01;

public class ArrayMainTest2 {
	public static void main(String[] args) {
		// ������ �����͸� ������ ��Ƽ� �����ϱ� ���� ��
		int[] nums = new int[12];

		// ������ ���� �� �ִ� �迭�� 12ĭ ����� �ּ���
		Zealot[] zealots = new Zealot[12];

		// ������ ���� �� �ִ� �迭�� 12ĭ ����� �ּ���
		Marine[] marines = new Marine[12];

		// ���۸��� ���� �� �ִ� �迭�� 12ĭ ����� �ּ���
		Zergling[] zerglings = new Zergling[12];

		// �迭�� for���� �Բ� ���� ���ȴ�.
		for (int i = 0; i < zealots.length; i++) {
			zealots[i] = new Zealot("����" + (i + 1));
		} // end of for

		// 1���� ) ���� ����
		for (int i = 0; i < marines.length; i++) {
			marines[i] = new Marine("����" + (i + 1));
		}

		// 2���� ) ���۸� ����
		for (int i = 0; i < zerglings.length; i++) {
			zerglings[i] = new Zergling("���۸�" + (i + 1));
		}
		System.out.println(zerglings[11].getName());

		// 3����) ���� 12������ ������ ����� �ּ���. for�� ���

		for (int i = 0; i < zealots.length; i++) {
//			zealots[i] = new Zealot("����" + (i + 1));
			zealots[i].showInfo();
		}

	}

}