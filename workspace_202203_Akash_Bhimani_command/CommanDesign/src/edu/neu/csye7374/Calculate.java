package edu.neu.csye7374;

import java.util.ArrayList;
import java.util.List;

public class Calculate implements Calculator {

	int a;
	int b;
	List<Integer> list = new ArrayList<>();
	
	public Calculate(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
    public Calculate(int ... nums) {
        for (int i : nums) {
            this.list.add(i);
        }
    }

	@Override
	public void add(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a + " + " + b + " = " + (a + b));
	}

	@Override
	public void subtract(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a + " - " + b + " = " + (a - b));
	}

	@Override
	public void multiply(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a + " * " + b + " = " + (a * b));
	}

	@Override
	public void divide(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a + " / " + b + " = " + (a / b));
	}

	@Override
	public void sum(List<Integer> list) {
		// TODO Auto-generated method stub
		System.out.println("1 + 2 + 3 + 4 = " + list.stream().mapToInt(Integer :: intValue).sum());
	}

}
