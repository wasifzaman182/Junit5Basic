package writeTests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MathUtilsTest {

	MathUtils m;
	
	@BeforeEach
	 void init() {
		m = new MathUtils();
	}
	
	@AfterEach
	 void afterAll() {
		System.out.println("Method is clear");
	}
	
	@Test
	void test() {
		int expected = 3;
		int actual = m.add(2, 1);
		assertEquals(3, 3,"add method");
	}

	@Test
	void testDividMethod() {
		assertThrows(ArithmeticException.class, () -> m.divid(1, 0),"divid method");
	}
	
}
