package com.test;

class Animal<T>{//�Ϲ�ȭ ���ʸ����¸� �����Ѵ�
	T b;
	
	void setBreath(T b) {
		this.b=b;
	}
	T getBreath() {
		return b;
	}
}
class Dog {
	@Override
	public String toString() {
		return "Dog";
	}
	
}
class Cat {
	
}


public class Test2 {
	
	public static void main(String[] args) {
		Animal<Dog>a = new Animal<Dog>();
		a.setBreath(new Dog());//�� ��ü ���� set
		Dog dog = a.getBreath();//get���� �ޱ�
		
		Animal<Cat>c = new Animal<Cat>();
		System.out.println(dog);
		

	}

}
