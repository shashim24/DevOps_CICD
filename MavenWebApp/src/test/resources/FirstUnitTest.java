package src.test.resources;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import src.main.resources.TestOne;

public class FirstUnitTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Set Up Before Class");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("Tear Down After Class");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Set Up");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Tear Down");
	}

	@Test
	public void test() {
		assertEquals(10,TestOne.add(6,4))
	}

}
