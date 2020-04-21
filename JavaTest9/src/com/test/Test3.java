package com.test;

import java.util.ArrayList;

public class Test3 {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("One");
		al.add("Two");
		al.add("Three");
		
		for(String s: al) {
			System.out.println(s);
		}
		
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		al2.add(1);
		al2.add(2);
		al2.add(3);
		al2.add(4);
		al2.add(5);
		
		for(int s : al2) {
			System.out.println(s);
		}
		
	}

}
