package writeTests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class MathUtilsTest {

	MathUtils m;
	
	@BeforeAll
	void runBeforeEvery(){
		System.out.println("Before everything");
	}
	
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
	@Disabled
	void testDividMethod() {
		assertThrows(ArithmeticException.class, () -> m.divid(1, 0),"divid method");
	}
	
	@Test
	@DisplayName("MethodName")
	void changeMethodName() {
		System.out.println("current changeMethodName  " + "New MethodName " );
	}
}
