
public class EmployeeFullOrPart {
	public static void main(String[] args) {
		int IsFullTime =1;
		int IsPartTime =2;
		int EmpRatePerHour=20;
		int emphrs=0;
		int empwage=0;
		double empcheck=Math.floor(Math.random()*10)%3;
		if (empcheck == IsFullTime)
			emphrs=8;
		else if (empcheck == IsPartTime)
			emphrs=4;
		else
			emphrs=0;
		empwage = emphrs*EmpRatePerHour;
		System.out.println("EmpWage:"+empwage);
	
	}

}
