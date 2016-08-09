package tel_ran.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import tel_ran.collections.LinkedList;

public class LinkedListTest {

	private static final int LENGTH = 31;
	LinkedList<Integer> list;

	@Before
	public void setUp() throws Exception {
		list = new LinkedList<Integer>();
		for (int i = 0; i < LENGTH; i++) {
			list.add(i);
		}
	}
	
	@Test
	public void testReverse() {
		Integer[] arrayActual = new Integer[LENGTH];
		Integer[] arrayExpect = new Integer[LENGTH];
		for(int i = 0; i < LENGTH; i++){
			arrayExpect[i] = LENGTH - 1 - i;
		}
		list.reverse();
		int i = 0;
		for(Integer num : list){
			arrayActual[i++] = num;
		}
		assertArrayEquals(arrayActual, arrayExpect);
	}
	
	private void testHasLoop(int to, int from){
//		assertFalse(list.hasLoop());
//		assertEquals(list.setLoop(to, from), list.hasLoop());
//		
		assertFalse(list.hasLoopPreviousCorrupted());
		assertEquals(list.setLoop(to, from), list.hasLoopPreviousCorrupted());
	}
	
	@Test
	public void testHasLoop1() {
		testHasLoop(0,LENGTH);
	}
	@Test
	public void testHasLoop2() {
		testHasLoop(LENGTH, 0);
	}
	@Test
	public void testHasLoop3() {
		testHasLoop(LENGTH, LENGTH);
	}
	@Test
	public void testHasLoop4() {
		testHasLoop(LENGTH, LENGTH - 1);
	}
	@Test
	public void testHasLoop5() {
		testHasLoop(LENGTH - 1, LENGTH);
	}
	@Test
	public void testHasLoop6() {
		testHasLoop(LENGTH, LENGTH + 1);
	}
	@Test
	public void testHasLoop7() {
		testHasLoop(0, LENGTH + 1);
	}
	@Test
	public void testHasLoop8() {
		testHasLoop(1, LENGTH -1);
	}
	@Test
	public void testHasLoop9() {
		testHasLoop(-1, LENGTH);
	}
	@Test
	public void testHasLoop10() {
		testHasLoop(LENGTH - 5, LENGTH - 2);
	}
	@Test
	public void testHasLoop11() {
		testHasLoop(LENGTH - 5, LENGTH - 6);
	}

}
