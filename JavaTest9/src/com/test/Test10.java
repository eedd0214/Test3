package com.test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
public class Test10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<>();
		al.add("�ϳ�");
		al.add("��");
		al.add("��");
		
		for(String s :al) {
			System.out.println(s);
		}
		for(Iterator<String> itr = al.iterator(); itr.hasNext();) {
			//iteratorŸ���� �ް� �ϳ��� �Ѱ��ִ°�
			//�ʱⰪ���� ����
			
			System.out.println(itr.next());
		}
		List<String >al2 =new ArrayList<String>();
		al2.add("�ϳ�2");
		al2.add("��2");
		al2.add("��2");
		
		for(String s :al2) {
			System.out.println(s);
		}
		
		for(Iterator<String> itr = al2.iterator(); itr.hasNext();) {
			System.out.println(itr.next());
		}
		
		
		
	}

}
