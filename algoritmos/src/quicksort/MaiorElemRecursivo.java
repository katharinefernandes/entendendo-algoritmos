package quicksort;

public class MaiorElemRecursivo {

	public static void main(String[] args) {
		int[] valores = { 3, 2, 8, 7, 1, 3};
		System.out.println(maiorElemento(valores, 0, 0));
	}

	public static int maiorElemento(int[] elementos, int maiorElemento, int index) {
		
		if(elementos.length == index) {
			return maiorElemento;
		} else {
			if(elementos[index] > maiorElemento) {
				maiorElemento = elementos[index];
			}
			return  maiorElemento(elementos, maiorElemento, index +1);
			
		}
	}

}
