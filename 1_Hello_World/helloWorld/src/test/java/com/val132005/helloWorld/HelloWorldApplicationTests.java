package com.val132005.helloWorld;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class HelloWorldApplicationTests {

	@Test
	void sayHello() {
		Hello hello = new Hello();
		String name = "Valentina";


		String result = hello.sayHello(name);

		assertEquals("Hello " + name, result);
	}

}
