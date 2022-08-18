import java.util.Scanner;
public class Calculator1 {

	public static void main(String[] args) {
		char operator;
		double num1,num2;
		Scanner sc = new Scanner(System.in);
		
		
		// Taking User Input
		
		System.out.println("Enter 1st No.");
		num1 = sc.nextDouble();
		
		System.out.println("Enter 2nd No.");
		num2 = sc.nextDouble();
		
		sc.nextLine();
		System.out.println("Enter Operator");
		String scan = sc.nextLine();
		operator = scan.charAt(0);
		
		
		
		// calculation Perform
		System.out.println("Output is : ");
		switch(operator) {
		case '+' -> System.out.println(num1+ num2);
		
		case '-' -> System.out.println(num1-num2);
		
		case '*' -> System.out.println(num1*num2);
		
		case '/' -> System.out.println(num1/ num2);
		
		default -> System.out.println("wrong Operator");
		}
			 }
}