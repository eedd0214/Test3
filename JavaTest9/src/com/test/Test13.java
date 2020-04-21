package com.test;

import java.util.ArrayList;
import java.util.zip.Adler32;

public class Test13 {
	static Double add(ArrayList<? extends Number> num) {
		double sum = 0.0;
		for(Number n : num) {
			sum += n.doubleValue();
		}
		return sum;
		
	}
	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<>();
		al.add(100);
		al.add(200);
		System.out.println(add(al));
		
		ArrayList<Double> a2 = new ArrayList<>();
		a2.add(32.30);
		a2.add(10.2034);
		System.out.println(add(a2));
	
		
	}

}
