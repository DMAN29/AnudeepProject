import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		// define scanner class for taking user Input
		Scanner sc = new Scanner(System.in);
		
		// taking input from the user
		System.out.println("Enter No. of Rows");
		int no = sc.nextInt();
		
		// declearing l for use in nested loop
		int l=0;
		
		
		//start of nested loop
		for(int i =1; i<=no;i++) {
			System.out.println();
			
			
			for(int j =1;j<=i;j++) {
				System.out.print(j);
			l=j;
			}
			
			
			for(int k= l-1; k>0;k--) {
				System.out.print(k);
			}
		}

		
		
		sc.close();
	}

}
