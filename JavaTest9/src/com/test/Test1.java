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
		//�������� �߰����� ����� �þ �߰� ���Ű� ��
		//Ÿ���� �ٸ� �͵��� �׳� ������ �ִ�.
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
