package com.test;

import java.util.ArrayList;
import java.util.List;

class A{
	
}
class B extends A{
	
}
class C extends A{
	
}
public class Test11 {
	static void testMethod(List<?> els) {
		for(Object o: els) {
			System.out.println(o);
			
		}
	}
	public static void main(String[] args) {
		List<A> aList = new ArrayList<A>();//타입에 구애받지않고 만들고싶다.
		List<B> bList = new ArrayList<B>();
		testMethod(aList);
		testMethod(bList);
		
		//aList = bList; 타입이 맞지 않음
//		bList = aList;
//		List<B> bList2 = aList;
		
		
		List<?> list1 = new ArrayList<A>();
		List<? extends A> list2 = new ArrayList<A>();
		List<? super A> list3 = new ArrayList<A>();
		
		
		
		
	}

}
