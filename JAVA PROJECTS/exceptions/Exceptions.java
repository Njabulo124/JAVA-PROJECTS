package exceptions;


public class Exceptions  {

	public static void main(String[] args) {
		int a [] = new int[5];
	
		try {
			//a[5] = 35;
			int b = 15/0;
			
		}
		catch(ArrayIndexOutOfBoundsException e){
			
			e.printStackTrace();
		}
        catch (ArithmeticException e) {
         e.printStackTrace();
        }
	}

}
