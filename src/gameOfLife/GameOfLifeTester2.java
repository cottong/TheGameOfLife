package gameOfLife;

import static org.junit.Assert.*;

import org.junit.Test;

public class GameOfLifeTester2 {

	/*@Test
	public void test() {
		fail("Not yet implemented");
	}*/
	@Test
	public void test() {
		assertEquals(false, GameOfLife2.LOD(true,0));	
	}
	public void test1() {
		assertEquals(false, GameOfLife2.LOD(true,1));	
	}
	public void test2() {
		assertEquals(true, GameOfLife2.LOD(true,2));	
	}
	public void test3() {
		assertEquals(true, GameOfLife2.LOD(true,3));	
	}
	public void test4() {
		assertEquals(false, GameOfLife2.LOD(true,4));	
	}
	public void test5() {
		assertEquals(false, GameOfLife2.LOD(true,5));	
	}
	public void test6() {
		assertEquals(false, GameOfLife2.LOD(true,6));	
	}
	public void test7() {
		assertEquals(false, GameOfLife2.LOD(true,7));	
	}
	public void test8() {
		assertEquals(false, GameOfLife2.LOD(true,8));	
	}
	public void test9() {
		assertEquals(false, GameOfLife2.LOD(false,0));	
	}
	public void test10() {
		assertEquals(false, GameOfLife2.LOD(false,1));	
	}
	public void test11() {
		assertEquals(false, GameOfLife2.LOD(false,2));	
	}
	public void test12() {
		assertEquals(true, GameOfLife2.LOD(false,3));	
	}
	public void test13() {
		assertEquals(false, GameOfLife2.LOD(false,4));	
	}
	public void test14() {
		assertEquals(false, GameOfLife2.LOD(false,5));	
	}
	public void test15() {
		assertEquals(false, GameOfLife2.LOD(false,6));	
	}
	public void test16() {
		assertEquals(false, GameOfLife2.LOD(false,7));	
	}
	public void test17() {
		assertEquals(false, GameOfLife2.LOD(false,8));	
	}
}
