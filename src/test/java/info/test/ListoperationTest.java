package info.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import info.list.Listoperation;

public class ListoperationTest {
	
	Listoperation listoperation=null;
	@Before
	public void setUp() throws Exception {
		listoperation=new Listoperation();
	}

	@Test
	public void Addtest() {
		assertEquals(true, listoperation.add(10));
		assertEquals(true, listoperation.add("Teju"));
		assertEquals(true, listoperation.add(5.05));
		assertEquals(true, listoperation.add(800.0f));
		assertEquals(true, listoperation.add('s'));
		
	}
	@Test
	public void findtest()
	{
		listoperation.add(9);
		listoperation.add(6);
		listoperation.add(7);
		listoperation.add(2);
		listoperation.add(3);
		listoperation.add(11);
		Object result=listoperation.find(2);
		assertEquals(7,result);
	}
	@Test
	public void deletetest()
	{
		listoperation.add(9);
		listoperation.add(6);
		listoperation.add(7);
		listoperation.add(2);
		assertEquals(true, listoperation.Delete(2));
	}
	@Test
	public void sizetest()
	{
		listoperation.add(9);
		listoperation.add(6);
		listoperation.add(7);
		listoperation.add(2);
		assertEquals(4, listoperation.Size());
	}
	@Test
	public void isEmptytest()
	{
		assertEquals(true, listoperation.isEmpty());
	}
	@Test
	public void displayListTest()
	{
		listoperation.add(9);
		String result=listoperation.DisplayList();
		assertEquals("9", result);
		
	}
}
