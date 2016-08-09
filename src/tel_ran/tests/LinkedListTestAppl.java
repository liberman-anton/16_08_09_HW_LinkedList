package tel_ran.tests;

import tel_ran.collections.LinkedList;

public class LinkedListTestAppl {

	private static final int LIST_LENGTH = 10;

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		for (int i = 0; i < LIST_LENGTH; i++) {
			list.add(i);
		}
		for(Integer num : list){
			System.out.print(num + "\t");
		}
		System.out.println();
		
//		list.setLoop(2, 5);
//		for(Integer num : list){
//			System.out.println(num);
//		}
		
		list.reverse();
		for(Integer num : list){
			System.out.print(num + "\t");
		}
	}

}
