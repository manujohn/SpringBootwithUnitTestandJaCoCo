package com.example.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AdditionTests {

	@Autowired
	Addition addition;

	@Test
	public void sumTest() {
		assertEquals(5, addition.sum(2, 3));
	}

}
