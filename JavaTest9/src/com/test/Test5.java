package com.test;
// Ÿ�� �ޱ� �����Ƽ� �̸� ��� �������ִ� T��� ���� ����� ���
class Apple extends Object{
	
	
}
class Box1<T> extends Object{
	private T a;
//	public Box (Apple a) {//���ø� ���� �� �ִ�.  Apple a= new Apple();
//		
//	}
	public Box1(T a) {//Object a = new Apple();
		this.a =a;
		
	}
	public void setBox1(T a) {
		this.a =a;
		
	}
	public T getBox() {
		return this.a = a;
	}
}

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box1<Apple> o = new Box1<Apple>(new Apple());
		o.setBox1(new Apple());
		System.out.println(o.getBox());
		Box1 b = new Box1(new Apple());
		
	}

}
