package com.test;

import java.util.ArrayList;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4};
		
		for(int i=0; i <arr.length;i++) {
			System.out.println(arr[i]);
			
		}
		System.out.println();
		ArrayList al = new ArrayList();
		//쓸데마다 추가가능 사이즈가 늘어남 추가 제거가 편리
		//타입이 다른 것들을 그냥 넣을수 있다.
		al.add(1);
		al.add("test");
		

		System.out.println(al.get(0));
		System.out.println(al.get(1));
		
		System.out.println();

		
		for(Object o : al) {
			System.out.println(o.toString());
		}
	}

}
