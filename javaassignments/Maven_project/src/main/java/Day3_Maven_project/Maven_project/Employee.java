package Day3_Maven_project.Maven_project;

public class Employee {
	public static void main(String[] args) {
		System.out.println("Employee Wage Computation");
		int IsFullTime =1;
		double empcheck = Math.floor(Math.random()*10)%2;
		if (empcheck == IsFullTime) {
			System.out.println("Employee is present");
		}
		else {
			System.out.println("Employee is abscent");
		
		}
	}
	

}
