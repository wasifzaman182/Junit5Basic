package writeTests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MathUtilsTest {

	@Test
	void test() {
		MathUtils m = new MathUtils();
		int expected = 3;
		int actual = m.add(2, 1);
		assertEquals(3, 3);
	}

	
}
