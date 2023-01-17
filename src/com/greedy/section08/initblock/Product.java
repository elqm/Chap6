package com.greedy.section08.initblock;

public class Product {
	
	private String name = "������";
	private int price = (int) (Math.random() * 1000000);
	private static String brand = "���";
	
	{
		name = "���̾�";
//		price = (int) (Math.random() * 1000000);
		int sum = 0;
		for(int i = 0; i < 1000000; i++) {
			sum += (int) (Math.random() * 10);
		}
		price = sum;
		brand = "����";
		System.out.println("�ν��Ͻ� �ʱ�ȭ �� ������...");
	}
	
	static {
//		name = "���̻�";
//		price = 1500000;
		brand = "���";
		System.out.println("���� �ʱ�ȭ �� ������...");
	}
	
	public Product() {
		System.out.println("�⺻ ������ ȣ���...");
	}
	
	public Product(String name, int price, String brand) {
		
		this.name = name;
		this.price = price;
		Product.brand = brand;
		
		System.out.println("�Ű����� �ִ� ������ ȣ���...");
	}
	
	public String getInformation() {
		
		return "Product [name=" + this.name + ", price=" + this.price + ", brand=" + Product.brand + "]";
	}
}
