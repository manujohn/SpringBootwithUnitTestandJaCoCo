package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;

public class CalculatorService {

	@Autowired
	private Addition addition;

	public int operation(int n1, int n2) {
		int n = addition.sum(n1, n2);
		return n - 2;
	}
}
