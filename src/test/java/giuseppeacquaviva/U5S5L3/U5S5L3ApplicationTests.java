package giuseppeacquaviva.U5S5L3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class U5S5L3ApplicationTests {
	@Test
	void testAddition() {
		int result = 2 + 3;
		assertEquals(5, result, "La somma di 2 + 3 dovrebbe essere 5");
	}

	@Test
	void testDivisionByZeroThrowsException() {
		ArithmeticException exception = assertThrows(ArithmeticException.class, () -> {
			int result = 10 / 0;
		});
		assertEquals("/ by zero", exception.getMessage());
	}

	@Test
	void testArraySorting() {
		int[] numbers = {3, 1, 4, 1, 5};
		Arrays.sort(numbers);
		assertArrayEquals(new int[]{1, 1, 3, 4, 5}, numbers);
	}

	@ParameterizedTest
	@CsvSource({
			"2, 3, 6",
			"5, 4, 20",
			"-1, 3, -3",
			"0, 7, 0"
	})
	void testMultiplication(int a, int b, int expectedResult) {
		assertEquals(expectedResult, a * b, "La moltiplicazione di " + a + " e " + b + " dovrebbe essere " + expectedResult);
	}

	private StringBuilder sb;

	@BeforeEach
	void setUp() {
		sb = new StringBuilder();
	}

	@Test
	void testAppend() {
		sb.append("Hello");
		sb.append(" World");
		assertEquals("Hello World", sb.toString());
	}

	@AfterEach
	void tearDown() {
		sb = null; // Pulizia
	}
}
