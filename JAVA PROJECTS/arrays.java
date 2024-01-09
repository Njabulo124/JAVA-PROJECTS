package arrays;
import java.util.Scanner;

public class arrays {
	public static void main(String args[]){
		int arr[];
		Scanner enter = new Scanner(System.in);
		int sum=0;
		arr = new int[5];
		arr[0]=enter.nextInt();
		arr[1]=enter.nextInt();
		arr[2]=enter.nextInt();
		arr[3]=enter.nextInt();
		arr[4]=enter.nextInt();
		for(int i=0; i<5; i++) {
			
			sum+=arr[i];
			System.out.println(arr[i]);
		}
		System.out.println(+sum);
		
		
		
	}

}
