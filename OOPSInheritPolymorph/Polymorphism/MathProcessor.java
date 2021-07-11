package Polymorphism;

class MathProcessor extends Processor {
	//The process() method is overloaded in the Processor class. Then, they are overridden in this child class.

	@Override
	public void process(int i, int j) {
		System.out.println("Sum of integers is " + (i + j));
	}

	@Override
	public void process(int a, int b, int c) {
		int sum = 0;
		sum=a+b+c;
		System.out.println("The integers are: "+a+", "+b+", and "+c);
		System.out.println("Sum of the integers are: " + sum);
	}

}