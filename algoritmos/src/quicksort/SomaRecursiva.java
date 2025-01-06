package quicksort;

public class SomaRecursiva {
	
    public static void main(String[] args) {
        int[] valores = {1, 2, 3};
        System.out.println(soma(valores, 0));
    }

    public static int soma(int[] valores, int index) {
        if (index == valores.length) {
            return 0;
        } else {
            return valores[index] + soma(valores, index + 1);
        }
    }

//	public static void main(String[] args) {
//
//		List<Integer> valores = new ArrayList<>(Arrays.asList(2, 2, 3, 6));
//		System.out.println(soma(valores));
//	}
//
//	public static int soma(List<Integer> valores) {
//		int valorSoma = 0;
//
//		if (valores.isEmpty()) {
//			return 0;
//		} else {
//			valorSoma = valores.get(0);
//			valores.remove(0);
//
//			return valorSoma + soma(valores);
//		}
//
//	}
}
