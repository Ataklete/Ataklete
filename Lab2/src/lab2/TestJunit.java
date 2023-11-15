package lab2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestJunit {

	@Test
	void test() {
		Testing test = new Testing();
		int output = (int) test.slope(new int[]{2, -5, -21, 3, 8, 18, 45, 0, 12, 18, 6, 3, 1, 0, -22});
		assertEquals(-22,output);
	}

}
