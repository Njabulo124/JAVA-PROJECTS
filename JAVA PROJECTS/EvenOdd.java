package evenodd;
import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter integer");
		int n = input.nextInt();
		if(n%2==0) {
			System.out.println("even");
		}
		if(n%2==1) {
			System.out.println("odd");
		}
	}

}
