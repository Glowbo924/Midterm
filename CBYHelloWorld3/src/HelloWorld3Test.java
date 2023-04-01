import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class HelloWorld3Test {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		HelloWorld3 hw = new HelloWorld3();
		System.out.println("Square " + hw.Square(4));
		assertEquals("Expected and actual coefficients DON'T match", 16, hw.Square(4));
		//fail("Not yet implemented")
	}

	@Test
	void test2() {
		HelloWorld3 hw = new HelloWorld3();
		System.out.println("Cube " + hw.cube(4));
		assertEquals("Expected and actual coefficients DON'T match", 64, hw.cube(4));

}
}
