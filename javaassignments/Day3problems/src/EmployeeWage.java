
public class EmployeeWage {
	public static void main(String[] args) {
		int IsFullTime =1;
		int EmpRatePerHour=20;
		int emphrs = 0;
		int empwage = 0;
		double empcheck = Math.floor(Math.random()*10)%2;
		if (empcheck==IsFullTime)
			emphrs =8;
		else
			emphrs =0;
		empwage =emphrs*EmpRatePerHour;
		System.out.println("empwage:"+empwage);
		
	}

}
