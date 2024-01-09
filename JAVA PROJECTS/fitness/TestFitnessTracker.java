package fitness;

public class TestFitnessTracker {
	
	public static void main(String args[]) {
		fitnessTracker n = new fitnessTracker("RUNNING",60,"15 FEBRUARY");
	   
		System.out.println("Today my daily exercise was   "+n.getactivity());
		System.out.println("Today I exercised for         "+n.getminutes()+" minutes");
		System.out.println("Todays date is 		      "+n.getdate());
		
		n.setactivity("Jumping");
		n.setdate("20 January 2023");
		n.setminutes(45);
		System.out.println("-------------------------------------------------------");
		System.out.println("Today my daily exercise was   "+n.getactivity());
		System.out.println("Today I exercised for         "+n.getminutes()+" minutes");
		System.out.println("Todays date is 		      "+n.getdate());
		Njabulo p= new Njabulo();
		p.print();
		
	}

}
