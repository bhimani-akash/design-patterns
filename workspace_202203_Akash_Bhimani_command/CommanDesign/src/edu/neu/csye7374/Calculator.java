package edu.neu.csye7374;

import java.util.List;

public interface Calculator {
	public void add(int a, int b);

	public void subtract(int a, int b);

	public void multiply(int a, int b);

	public void divide(int a, int b);

	public void sum(List<Integer> list);
}
