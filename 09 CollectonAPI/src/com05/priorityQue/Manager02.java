package com05.priorityQue;

import java.util.PriorityQueue;

public class Manager02 {
	public static void main(String[] args) {

		// Creating a priority queue
		PriorityQueue<Integer> numbers = new PriorityQueue<>();
		numbers.add(4);
		numbers.add(2);
		numbers.add(1);
		System.out.println("PriorityQueue: " + numbers);

		// Using the peek() method
		int number = numbers.peek();
		System.out.println("Accessed Element: " + number);
	}
}
