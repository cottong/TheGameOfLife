package gameOfLife;

import static org.junit.Assert.*;

import org.junit.Test;

public class GameOfLifeTester {

/*	@Test
	public void test() {
		fail("Not yet implemented");
	}*/
	
	
	@Test
	public void test1() {
		assertEquals(".",GameOfLifeApp.GOLProcessor(0,0));
	}
	
	@Test
	public void test2() {
		assertEquals(".",GameOfLifeApp.GOLProcessor(0,1));
	}
	@Test
	public void test3() {
		assertEquals(".",GameOfLifeApp.GOLProcessor(0,2));
	}
	@Test
	public void test4() {
		assertEquals(".",GameOfLifeApp.GOLProcessor(0,3));
	}
	@Test
	public void test5() {
		assertEquals(".",GameOfLifeApp.GOLProcessor(0,4));
	}
	@Test
	public void test6() {
		assertEquals(".",GameOfLifeApp.GOLProcessor(0,5));
	}
	@Test
	public void test7() {
		assertEquals(".",GameOfLifeApp.GOLProcessor(0,6));
	}
	@Test
	public void test8() {
		assertEquals(".",GameOfLifeApp.GOLProcessor(0,7));
	}
	@Test
	public void test9() {
		assertEquals(".",GameOfLifeApp.GOLProcessor(1,0));
	}
	
	@Test
	public void test10() {
		assertEquals(".",GameOfLifeApp.GOLProcessor(1,1));
	}
	@Test
	public void test11() {
		assertEquals(".",GameOfLifeApp.GOLProcessor(1,2));
	}
	@Test
	public void test12() {
		assertEquals("*",GameOfLifeApp.GOLProcessor(1,3));
	}
	@Test
	public void test13() {
		assertEquals("*",GameOfLifeApp.GOLProcessor(1,4));
	}
	@Test
	public void test14() {
		assertEquals(".",GameOfLifeApp.GOLProcessor(1,5));
	}
	@Test
	public void test15() {
		assertEquals(".",GameOfLifeApp.GOLProcessor(1,6));
	}
	@Test
	public void test16() {
		assertEquals(".",GameOfLifeApp.GOLProcessor(1,7));
	}
	@Test
	public void test17() {
		assertEquals(".",GameOfLifeApp.GOLProcessor(2,0));
	}
	
	@Test
	public void test18() {
		assertEquals(".",GameOfLifeApp.GOLProcessor(2,1));
	}
	@Test
	public void test19() {
		assertEquals(".",GameOfLifeApp.GOLProcessor(2,2));
	}
	@Test
	public void test20() {
		assertEquals("*",GameOfLifeApp.GOLProcessor(2,3));
	}
	@Test
	public void test21() {
		assertEquals("*",GameOfLifeApp.GOLProcessor(2,4));
	}
	@Test
	public void test22() {
		assertEquals(".",GameOfLifeApp.GOLProcessor(2,5));
	}
	@Test
	public void test23() {
		assertEquals(".",GameOfLifeApp.GOLProcessor(2,6));
	}
	@Test
	public void test24() {
		assertEquals(".",GameOfLifeApp.GOLProcessor(2,7));
	}
	@Test
	public void test25() {
		assertEquals(".",GameOfLifeApp.GOLProcessor(3,0));
	}
	
	@Test
	public void test26() {
		assertEquals(".",GameOfLifeApp.GOLProcessor(3,1));
	}
	@Test
	public void test27() {
		assertEquals(".",GameOfLifeApp.GOLProcessor(3,2));
	}
	@Test
	public void test28() {
		assertEquals(".",GameOfLifeApp.GOLProcessor(3,3));
	}
	@Test
	public void test29() {
		assertEquals(".",GameOfLifeApp.GOLProcessor(3,4));
	}
	@Test
	public void test30() {
		assertEquals(".",GameOfLifeApp.GOLProcessor(3,5));
	}
	@Test
	public void test31() {
		assertEquals(".",GameOfLifeApp.GOLProcessor(3,6));
	}
	@Test
	public void test32() {
		assertEquals(".",GameOfLifeApp.GOLProcessor(3,7));
	}
	
}
