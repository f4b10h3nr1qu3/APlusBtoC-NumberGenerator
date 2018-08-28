package com.f4b10h3nr1qu3.numbergenerator;

import java.util.LinkedList;

/**
 * Generates a number with a fixed length based on two numbers with different length .
 * 
 * @author fhv4it@gmail.com<Fabio Henrique>
 *
 */
public class GenerateNumber {

	private static final int MAX_DIGIT = 9;

	/**
	 * Generates the number
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public int generate(Integer a, Integer b) {

		LinkedList<Integer> stackA = buildStack(a);
		LinkedList<Integer> stackB = buildStack(b);

		int max = Math.max(stackA.size(), stackB.size());

		if (max >= MAX_DIGIT || (stackA.size() + stackB.size()) >= MAX_DIGIT) {
			return -1;
		}

		StringBuilder sb = new StringBuilder(9);

		for (int i = 0; i < max; i++) {

			if (stackA.size() > 0) {
				sb.append(stackA.pop());
			}

			if (stackB.size() > 0) {
				sb.append(stackB.pop());
			}

		}

		return Integer.parseInt(sb.toString());

	}

	private LinkedList<Integer> buildStack(Integer value) {
		LinkedList<Integer> stack = new LinkedList<Integer>();
		while (value > 0) {
			stack.push(value % 10);
			value = value / 10;
		}
		return stack;
	}

}
