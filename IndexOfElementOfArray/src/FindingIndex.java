
public class FindingIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {75,4,56,5,36,100,77,18,29,94};  // Declaring and initializing array
		
		
		
		// Checking is the no. 100 present in the array or not
		
		for(int i= 0; i< arr.length; i++) {    			// Starting of for loop
			if(arr[i] == 100) {							// starting of if condition
				System.out.println("Index of 100 in arr is "+ i);
			}											// end of if condition
		}												// end of for loop
	}

}
