package edu.neu.csye7374;

public class Demo {

	public static void demo() {

        System.out.println("----- Showing Batch Calculator Result -----");
        
        System.out.println("\nAddition of 6 and 3");
        BatchCalculator cmd1 = new BatchCalculator(new AddCommand
                (new Calculate(6, 3)));
        cmd1.invoke();

        System.out.println("\nSubtraction of 3 from 6");
        BatchCalculator cmd2 = new BatchCalculator(new SubtractCommand
                (new Calculate(6, 3)));
        cmd2.invoke();

        System.out.println("\nMultiplication of 6 and 3");
        BatchCalculator cmd3 = new BatchCalculator(new MultiplyCommand
                (new Calculate(6, 3)));
        cmd3.invoke();

        System.out.println("\nDivision of 6 by 3");
        BatchCalculator cmd4 = new BatchCalculator(new DivideCommand
                (new Calculate(6, 3)));
        cmd4.invoke();

        System.out.println("\nSum of 1, 2, 3 and 4");
        BatchCalculator cmd5 = new BatchCalculator(new SumCommand(new Calculate(1,2,3,4)));
        cmd5.invoke();

	}
}
