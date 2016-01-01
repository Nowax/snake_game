package examplePackage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ExampleUnitTestClass {

	ExampleSourceCodeClass uut;

	public ExampleUnitTestClass() {
		uut = new ExampleSourceCodeClass();
	}

	@Test
	public void shouldAddTwoNubmersTest() {
		assertEquals(5, uut.add(2,3));
	}
}
