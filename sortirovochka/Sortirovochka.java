public class Sortirovochka {
	public static void main(String[] args) {
		System.out.println("Sortirovochka v0.1");
		int N = 100;
		int[] chisla= new int[N];;
		fillArray(chisla,N);
		printArray(chisla);
		sort(chisla);
		printArray(chisla);
	}
	/**
	* Этот метод заполняет массив размером N
	*/
	static void fillArray(int[] array, int N){
		System.out.println("Filling array");
		for (int i=0; i<array.length ;i++ ) {
			array[i]=array.length - i;
		}
	}
	/**
	* Этот метод сортирует массив
	**/
	static void sort(int[] array){
		System.out.println("BubbleSorting ascending");
		for (int i=1; i<array.length ;i++ ) {
			for (int j=i; j<array.length ;j++ ) {
				if (array[j]>array[j-1]){ //Обмен
					int buffer 	= array[j] 	; //ПРомежуточное хранилище значения
					array[j] 	= array[j-1]; //меняем
					array[j-1] 	= buffer	; // кладем обратно
				}
			}
		}
	}

	static void printArray(int[] array){
		System.out.println("Array:");
		for (int i=0; i< array.length ; i++ ) {
			System.out.print(array[i]+" ");
		}
	}
}