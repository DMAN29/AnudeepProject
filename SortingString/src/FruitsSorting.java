import java.util.Arrays;																	// importing a java class called Arrays


public class FruitsSorting {

	public static void main(String[] args) {
		
		
		String[] fruits = {"Kiwi", "Apple", "Mango", "Banana", "Pinaple", "Orange"};		// Declaring and Initializing of the elements of fruit object
		
		
		Arrays.sort(fruits);																// Sorting of Array Fruits
		
		for(String fr : fruits) {															// loop to print each element of sorted array
			System.out.println(fr);
		}
	}

}
