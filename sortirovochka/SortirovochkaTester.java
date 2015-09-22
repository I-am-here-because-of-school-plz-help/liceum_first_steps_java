import java.util.Random;

class SortirovochkaTester {
	public static void main(String[] args) {
		Test();
	}
	public static void Test(){
		int N  =100;
		int[] array = new int[N];
		Random randomGenerator = new Random();
		for(int i=0; i<100; i++){
			array[i] = randomGenerator.nextInt()%100;
		}
		Sortirovochka.printArray(array);
		Sortirovochka.sortAsc(array);
		for(int i=1; i<100; i++){
			if (array[i]>array[i-1]) {
				System.out.println("This doesn't work good =(((((((");
				break;
			}
		}
		Sortirovochka.printArray(array);
	}
}