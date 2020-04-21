package com.test;



import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class Test1 {
	public static void main(String[] args) {
		List<String> l1 = new ArrayList<>();
		List<String> l2 = new LinkedList<>();
		List<String> l3 = new Vector<>();
		List<String> l4 = new Stack<>();
		
		
		l1.add("one");
		l1.add("two");
		l1.add("three");
		
		Iterator<String> ltr =l1.iterator();
		while(ltr.hasNext()) {
			System.out.println(ltr.next());
		}
		System.out.println();
		System.out.println();
		for(int i=0;i<l1.size();i++) {
			System.out.println(l1.get(i));
		}
		System.out.println();
		System.out.println();
		
		for(String s: l1) {
			System.out.println(s);
		}
		
		
	}
}
