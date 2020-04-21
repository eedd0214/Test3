package com.test;
// 타입 받기 귀찮아서 미리 모두 받을수있는 T라는 것을 만들어 사용
class Apple extends Object{
	
	
}
class Box1<T> extends Object{
	private T a;
//	public Box (Apple a) {//애플만 받을 수 있다.  Apple a= new Apple();
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
