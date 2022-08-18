import java.util.Scanner;
public class Group1 {

	public static void main(String[] args) {
			 Scanner sc = new Scanner(System.in);
				System.out.println("Input roll number ");
				
				//Roll number as input
				int roll = sc.nextInt();
				
				
//				Check Group
				int group = roll%4;
				
				
//				Printing Output
				switch(group) {
				case 1 -> System.out.println("Sapphire");
				case 2-> System.out.println("Pearl");
				case 3 ->System.out.println("Ruby");
				case 0 ->System.out.println("Emerald");
				}
					}
		}