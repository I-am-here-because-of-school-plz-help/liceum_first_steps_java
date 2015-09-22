public class Sortirovochka {
	public static void main(String[] args) {
		System.out.println("Sortirovochka v0.1");
		int N = 100;
		int[] chisla= new int[N];;
		fillArray(chisla,N);
		sort(chisla);
	}
	/**
	* Этот метод заполняет массив размером N
	*/
	static void fillArray(int[] array, int N){
		System.out.println("Filling array");
		array = new int[N];
		for (int i=0; i<N ;i++ ) {
			array[i]=i;
		}
	}
	/**
	* Этот метод сортирует массив
	**/
	static void sort(int[] array){
		System.out.println("BubbleSorting ascending");
		for (int i=1; i<array.length ;i++ ) {
			for (int j=i; j<array.length ;j++ ) {
				if (array[i]>array[i-1]){ //Обмен
					int buffer 	= array[i] 	; //ПРомежуточное хранилище значения
					array[i] 	= array[i-1]; //меняем
					array[i-1] 	= buffer	; // кладем обратно
				}
			}
		}
	}
}