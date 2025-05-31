package array;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class B10808_알파벳_개수Test {
	private ByteArrayInputStream testIn;
	private ByteArrayOutputStream testOut;

	@BeforeEach
	void setUpStreams() {
		testOut = new ByteArrayOutputStream();
		System.setOut(new PrintStream(testOut));
	}

	@AfterEach
	void restoreStreams() throws IOException {
		System.setIn(System.in);
		System.setOut(System.out);

		if (testOut != null) {
			testOut.close();
		}

		if (testIn != null) {
			testIn.close();
		}
	}

	@Test
	void case_baekjoon() throws IOException {

		System.setIn(new ByteArrayInputStream("baekjoon\n".getBytes()));
		String expectedOutput =
			"1 1 0 0 1 0 0 0 0 1 1 0 0 1 2 0 0 0 0 0 0 0 0 0 0 0";

		B10808_알파벳_개수.main(null);
		String actualOutput = testOut.toString().trim();
		assertEquals(expectedOutput, actualOutput);
	}

	@Test
	void case_abcdefg() throws IOException {

		System.setIn(new ByteArrayInputStream("abcdefg\n".getBytes()));
		String expectedOutput =
			"1 1 1 1 1 1 1 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0";

		B10808_알파벳_개수.main(null);
		String actualOutput = testOut.toString().trim();
		assertEquals(expectedOutput, actualOutput);
	}

}