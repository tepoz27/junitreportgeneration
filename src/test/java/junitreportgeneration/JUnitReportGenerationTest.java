package junitreportgeneration;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import junitreportgeneration.MyJunitClass;

public class JUnitReportGenerationTest {
	/*
	private String developer = "Vinod";

	@Test
	public void instanceOfTest() {
		assertThat(new ArrayList(), instanceOf(List.class));
	}

	@Test
	public void assertTrueTest() {
		assertTrue(true);
	}

	@Test
	public void equalToTest() {
		assertThat(developer, is("Vinod"));
	}
	
	@Test
	public void failTest() {
		assertThat(developer, is("Any"));
	}
	*/
	@Test
	public void Addtest() {
		MyJunitClass junit = new MyJunitClass();
		
		int result = junit.add(100, 200);
		
		assertEquals(300, result);
	}
}
