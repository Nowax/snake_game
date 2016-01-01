package firstTry;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class UnitTestClass {

	ClassWhichWillBeTested uut;
	
	public UnitTestClass() {
		uut = new ClassWhichWillBeTested();
	}

	@Test
	public void shouldAddTwoNubmersTest() {
		assertEquals(5, uut.add(2,3));
	}
	
	@Test
	public void subTest() {
		assertEquals(-1, uut.sub(2,3));
	}
	
	@Test
	public void chlopekPowinienZebracMleko() {
		assertEquals(9,uut.zbierzPlonyZFolwarku(10));
	}
	
	@Test
	public void chlopekPowinienZebracJajka() {
		assertEquals(7,uut.zbierzPlonyZFolwarku(8));
	}

	@Test
	public void chlopekPowinienZebracJagodyKiedyPanJestWystarczajacy() {
		uut.ustawPana(11);
		assertEquals(6,uut.zbierzPlonyZFolwarku(5));
	}

	@Test
	public void chlopekNiePowinienZebracJagodKiedyPanJestNiewystarczajacy() {
		uut.ustawPana(2);
		assertEquals(0,uut.zbierzPlonyZFolwarku(5));
	}

	@Test
	public void powinnoPowiedziecJakiPanJestWazny() {
		uut.ustawPana(2);
		assertEquals(2, uut.jakiPanWazny());
	}
}
