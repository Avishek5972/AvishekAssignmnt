package collectionDataStructGenerics;

public class GenericPrint {
	public static <E> void printArray(E[] inputArray) {
		for (E element : inputArray)
			System.out.printf("%s ", element);

		System.out.println();
	}

	public static void main(String args[]) {
		Integer[] intarr = { 6,2,4,4,2 };
		Double[] dbarr = { 5.5,7.7,9.9,2.2 };
		Character[] chararr = { 'M','A','G','I','C' };

		System.out.println("Array integerArray contains:");
		printArray(intarr);
		System.out.println("\nArray doubleArray contains:");
		printArray(dbarr); 
		System.out.println("\nArray characterArray contains:");
		printArray(chararr);
	} 
}

