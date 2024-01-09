package calculator;
import java.util.Scanner;
public class Calculator {
	public static void main(String[] args) {
		
		System.out.print("ENTER NUM 1 OPERATOR NUM 2 eg (5*2): ");
		Scanner input = new Scanner(System.in);
		double m1 = input.nextDouble();
		char r =input.next().charAt(0);
		double m2 = input.nextDouble();
		if (r == '+') 
			System.out.println((int)(m1 + m2));
		
		else if(r == '-') 
			System.out.println((int)(m1-m2));
		
		else if (r == '*') 
			System.out.println((int)(m1*m2));
		
		else if (r == '/') 
			System.out.println((int)(m1/m2));
		
	}
}
