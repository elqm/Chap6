package com.greedy.section08.initblock;

public class Application {

	public static void main(String[] args) {
		
		/* �ʱ�ȭ ��
		 * ������ �ʱ�ȭ�� ������ �� �ִ� ���� �����ϸ�, �ν��Ͻ� �ʱ�ȭ ���� ���� �ʱ�ȭ ������ ���еȴ�.
		 * 1. �ν��Ͻ� �ʱ�ȭ ��
		 * : �ν��Ͻ��� �����Ǵ� ������ ������ ȣ�� ������ ���� ������ �ȴ�.
		 *   �ν��Ͻ��� �����ϴ� �������� ȣ���� �ȴ�.
		 *   �ν��Ͻ� ������ �ʱ�ȭ�ϸ� ���� �ʵ忡�� ����������� ���� �����.
		 * {
		 *     �ʱ�ȭ ���� �ۼ�
		 * }   
		 * 
		 * 2. ���� �ʱ�ȭ ��
		 * : Ŭ������ �ε�� �� �� �� �����Ѵ�.
		 *   ���� �ʵ带 �ʱ�ȭ�ϸ�, �ν��Ͻ� ������ �ʱ�ȭ���� ���Ѵ�.
		 * static {
		 *     �ʱ�ȭ ���� �ۼ�
		 * }
		 * */
		Product product = new Product();
		System.out.println(product.getInformation());
		
		Product product2 = new Product("�����", 300000, "�����");
		System.out.println(product2.getInformation());
	}

}
