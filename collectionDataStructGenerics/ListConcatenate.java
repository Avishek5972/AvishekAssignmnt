package collectionDataStructGenerics;

public class ListConcatenate {



	public static <E> void concatenate(List<E> list1, List<E> list2) throws EmptyListException{




		List<E> copyList2 = new List<>();


		while(!list2.isEmpty()){

			E item = list2.removeFromFront();

			list1.insertAtBack(item);

			copyList2.insertAtBack(item);

		}



		while(!copyList2.isEmpty()){

			E item = copyList2.removeFromFront();

			list2.insertAtBack(item);

		}

	}



	public static void main(String[] args) throws EmptyListException {

		List<Character> list1 = new List<>();

		List<Character> list2 = new List<>();



		list1.insertAtBack('A');

		list1.insertAtBack('B');

		list1.insertAtBack('C');

		list1.insertAtBack('D');



		list2.insertAtBack('E');

		list2.insertAtBack('F');

		list2.insertAtBack('G');

		list2.insertAtBack('H');



		list1.print();

		list2.print();



		concatenate(list1, list2);



		list1.print();

		list2.print();



	}

}