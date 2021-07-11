package Polymorphism;

public class Processor {
	//process method is overloaded in this class

	public void process(int i, int j) {
		System.out.println("Processing two integers:"+ i+","+ j);
	}

	public void process(int a, int b, int c) {
		System.out.println("Adding integers" +(a+b+c));
	}

}