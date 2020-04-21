package com.test;

class Animal<T>{//일반화 제너릭형태를 지원한다
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
		a.setBreath(new Dog());//새 객체 생성 set
		Dog dog = a.getBreath();//get으로 받기
		
		Animal<Cat>c = new Animal<Cat>();
		System.out.println(dog);
		

	}

}
