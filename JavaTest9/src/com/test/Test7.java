package com.test;




public class Test7 {
	static <E> void printArr(E[] arr) {//E>>Integer
		for(E e : arr) {
			System.out.print(e);
		}
		System.out.println();
	} 
	
	public static void main(String[] args) {
		Integer[] arr= {1,2,3,4};
		Character[] chs = {'a','b','c','d','e'};
		printArr(arr);//E[] arr =arr;
		
		printArr(chs);
		
	}

}
