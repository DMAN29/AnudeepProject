//   Program to find the second largest element in An Array



import java.util.Arrays;		// Import Array class for some of its methods
public class SecondLargestNumverInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {75,4,56,5,36,100,77,18,29,94};							// Declaring and initializing an array
		Arrays.sort(arr);													// Sorting Array using the method of "Arrays" Class
		
		
		
		// Finding the second largest element
		for(int i = arr.length-2; i>=0;i--) {									// Starting of for loop from second last element to the  of array
		// Checking the maximum element occurs once or more
		// if it appears more than one time then we not consider it the second largest element and continue our search till we find the distinct element " the second maximum element "
				
			if(arr[i] != arr[arr.length-1]) {	
				System.out.println("Second Largest Element In array : "+ arr[i]);
				break;															// break the loop when we find the element
			}	
		}
	}

}
