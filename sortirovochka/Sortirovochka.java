public class Sortirovochka {
	public static void main(String[] args) {
		int N = 100;
		int[] chisla;
		fillArray(chisla,N);
	}
	/**
	* Этот метод заполняет массив размером N
	*/
	static void fillArray(int[] array, int N){
		array = new int[N];
		for (int i=0; i<N ;i++ ) {
			array[i]=i;
		}
	}
}