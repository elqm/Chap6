package com.greedy.section06.singleton;

public class Application {

	public static void main(String[] args) {
		
		/* singleton pattern�̶�?
		 * ���ø����̼��� ���۵� �� � Ŭ������ ���� �� ���� �޸𸮿� �Ҵ��ϰ� �� �޸𸮿� �ν��Ͻ��� ����
		 * �ϳ��� �ν��Ͻ��� �����ؼ� ����Ͽ� �޸� ���� ������ �� �ְ� �� (�Ź� �ν��Ͻ��� �������� ����)
		 * 
		 * ����
		 * 1. ù ��° �̿� �ÿ��� �ν��Ͻ��� �����ؾ� �ϹǷ� �ӵ� ���̰� ���� ������
		 *    �� ��° �̿� �ÿ��� �ν��Ͻ� ���� �ð��� �ʿ� ���� ������ ������.
		 * 2. �ν��Ͻ��� ���������� �� ���� �����ϴ� ���� ������ �� �ִ�.
		 * 
		 * ����
		 * 1. �̱��� �ν��Ͻ��� �ʹ� ���� ���� �ϰų� ���� �����͸� �����ϸ� ���յ��� ��������. (������������ ������)
		 * 2. ���ü� ������ ����ؼ� �����ؾ� �ϱ� ������ ���̵��� �ִ�.
		 * 
		 * �̱��� ���� ���
		 * 1. �̸� �ʱ�ȭ (Eager Initialization) : ���α׷� ���� �� �ν��Ͻ� ����
		 * 2. ������ �ʱ�ȭ (Lazy Initialization) : �޼ҵ� ȣ�� �� �ν��Ͻ� ����
		 * 
		 * �̸� �ʱ�ȭ�� ����ϸ� Ŭ������ �ε��ϴ� �ӵ��� ����������
		 * ó�� �ν��Ͻ� ��ȯ ��û���� �ӵ��� �����ٴ� ������ ������.
		 * �ݸ� ������ �ʱ�ȭ�� Ŭ������ �ε��ϴ� �ӵ��� ��������
		 * ù ��° ��û�� ���� �ӵ��� �� ��° ��û�� ���� �ӵ����� �����ٴ� Ư¡�� ������ �ִ�.
		 * */
		
//		EagerSingleton eager1 = new EagerSingleton();
		
		EagerSingleton eager1 = EagerSingleton.getInstance();
		EagerSingleton eager2 = EagerSingleton.getInstance();
		
		System.out.println("eager1 hashcode : " + eager1.hashCode());
		System.out.println("eager2 hashcode : " + eager2.hashCode());
		
		LazySingleton lazy1 = LazySingleton.getInstance();
		LazySingleton lazy2 = LazySingleton.getInstance();
		
		System.out.println("lazy1�� hashcode : " + lazy1.hashCode());
		System.out.println("lazy2�� hashcode : " + lazy2.hashCode());
	}

}
