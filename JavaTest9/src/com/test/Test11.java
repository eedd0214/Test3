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
		List<A> aList = new ArrayList<A>();//Ÿ�Կ� ���ֹ����ʰ� �����ʹ�.
		List<B> bList = new ArrayList<B>();
		testMethod(aList);
		testMethod(bList);
		
		//aList = bList; Ÿ���� ���� ����
//		bList = aList;
//		List<B> bList2 = aList;
		
		
		List<?> list1 = new ArrayList<A>();
		List<? extends A> list2 = new ArrayList<A>();
		List<? super A> list3 = new ArrayList<A>();
		
		
		
		
	}

}
