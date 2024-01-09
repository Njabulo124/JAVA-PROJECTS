package dowhileloop;
import java.util.Scanner;
public class DoWhileLoop {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		do {
			System.out.print("Enter number between 1 and 10 : ");
			n = input.nextInt();
			
		}while(n<1 || n>10);
		System.out.println(n +" is between 1 and 10");
	}
}
