package com.test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
public class Test10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<>();
		al.add("하나");
		al.add("둘");
		al.add("셋");
		
		for(String s :al) {
			System.out.println(s);
		}
		for(Iterator<String> itr = al.iterator(); itr.hasNext();) {
			//iterator타입을 받고 하나씩 넘겨주는거
			//초기값없이 가능
			
			System.out.println(itr.next());
		}
		List<String >al2 =new ArrayList<String>();
		al2.add("하나2");
		al2.add("둘2");
		al2.add("셋2");
		
		for(String s :al2) {
			System.out.println(s);
		}
		
		for(Iterator<String> itr = al2.iterator(); itr.hasNext();) {
			System.out.println(itr.next());
		}
		
		
		
	}

}
