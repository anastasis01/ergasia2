package gr.tasos.junit.first;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

 

class MyClassTest {

	@Test
	void testSub() {
		MyClass tester = new MyClass();
		assertEquals("POSITIVE", tester.sub(10, 5), "10 - 5 must be positive");	}

}