
public class EmployeePresentOrAbsent {
	public static void main(String[] args) {
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
