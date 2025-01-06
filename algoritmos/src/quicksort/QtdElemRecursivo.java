package quicksort;

public class QtdElemRecursivo {

	public static void main(String[] args) {
		int[] valores = { 1, 2, 3 };
		System.out.println(contElementos(valores, 0));
	}

	public static int contElementos(int[] elementos, int index) {

		if (elementos.length == index) {
			return index;
		} else {
			return contElementos(elementos, index + 1);
		}

	}

}
