package employee;

public class Employee {
	private
	String firstName;
	String lastName;
	int monthlySalary;
public
    Employee(String first,String last,int monthly) {
	firstName = first;
	lastName = last;
	monthlySalary = monthly;
	
}
	void setfirstName(String first) {
	firstName = first;
}
	String getfirstName() {
		return firstName;
}
	void setlastName(String last) {
		lastName = last;
}
	String getlastName() {
		return lastName; 
}
	void setmonthlySalary(int salary) {
		monthlySalary = salary;
}
	int getmonthlySalary() {
		if(monthlySalary<0)
			monthlySalary=0;
		return monthlySalary*12;
}
public static void main(String[] args) {
	Employee e1 = new Employee("NJABULO","MDUNJANA",3000);
	Employee e2 = new Employee("SIPHOKAZI","MJOLI",1500);
	
	System.out.println("Employee 1: "+e1.getfirstName()+" "+e1.getlastName()+"; "+"YEARLY SALARY: R"+e1.getmonthlySalary());
	System.out.println("Employee 2: "+e2.getfirstName()+" "+e2.getlastName()+"; "+"YEARLY SALARY: R"+e2.getmonthlySalary());
	System.out.println();
	System.out.println("INCREASING EMPLOYEE SALARIES BY 10%");
	System.out.println();
	double raise = e1.getmonthlySalary()+e1.getmonthlySalary()*0.1;
	double xaxa = e2.getmonthlySalary()+e2.getmonthlySalary()*0.1;
	System.out.println("Employee 1: "+e1.getfirstName()+" "+e1.getlastName()+"; "+"YEARLY SALARY: R"+raise);
	System.out.println("Employee 2: "+e2.getfirstName()+" "+e2.getlastName()+"; "+"YEARLY SALARY: R"+xaxa);
	

}
}
