package com.example.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CalculatorServiceTests {
	
	@InjectMocks
	CalculatorService calculatorService;

	@Mock
	Addition addition;
	
	@Test
	public void operationTest() {
		when(addition.sum(2, 3)).thenReturn(5);
		assertEquals(3, calculatorService.operation(2, 3));
		verify(addition).sum(2,3);
	}
}
