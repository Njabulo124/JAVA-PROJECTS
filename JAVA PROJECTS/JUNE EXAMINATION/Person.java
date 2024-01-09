package peps;

public class Person {
	
	protected String name;
	protected int age;
	
	public void displayinfo(String name, int age) {
		System.out.println(name);
		System.out.println(age);
	}
	
	
	public static void main(String[] args) {
		Person P = new Person();
		P.displayinfo("LIGHTY", 22);
	}
	
	

}
