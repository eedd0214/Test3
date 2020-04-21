package com.test;

import java.util.ArrayList;

class Box<T>{
	private T t;
	void add(T t) {
		this.t =t;
	
	}
	public T get() {
		return this.t;
	}
}

class MyArr<T>{
	private ArrayList<T> al;
	public MyArr(int size) {
		this.al = new ArrayList<T>();
	}
	public void setAl(T v) {
		al.add(v);
	}
	public T getAl(int inx) {
		return al.get(inx);
	}
}

public class Test4 {

	public static void main(String[] args) {
		Box<Integer> b1 = new Box<Integer>();
		b1.add(new Integer(2));
		Box<String> b2 = new Box<String>();
		b2.add("Hello Java");
		System.out.println(b1.get());
		System.out.println(b2.get());
		
		
	}

}
