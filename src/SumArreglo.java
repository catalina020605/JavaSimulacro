

public class SumArreglo {
		public static void main(String[] args) {
		
	        int[] arreglo1 = {1, 2, 3, 4, 5};
	        int[] arreglo2 = {6, 7, 8, 9, 10};


	        int[] arregloResultado = new int[arreglo1.length];

	        for (int i = 0; i < arreglo1.length; i++) {
	            arregloResultado[i] = arreglo1[i] + arreglo2[i];
	        }	   
	        System.out.println("Arreglo Resultante:");
	        for (int i = 0; i < arregloResultado.length; i++) {
	            System.out.print(arregloResultado[i] + " ");
	        }
	}
}
