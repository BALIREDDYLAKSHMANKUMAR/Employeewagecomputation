
public class EmployeeDays {
	public static final int IsFullTime =1;
	public static final int IspartTime=2;
	public static final int EmpRatePerHour=20;
	public static final int NumOfWorkingDays=20;
	
	public static void main(String[] args) {
		int emphrs=0;
		int empwage=0;
		int totalEmpwage=0;
		for (int day=0;day<NumOfWorkingDays;day++) {
			int empcheck= (int)Math.floor(Math.random()*10)%3;

			switch(empcheck) {
			case IsFullTime:
				emphrs=8;
				break;
			case IspartTime:
				emphrs=4;
				break;
			default:
				emphrs=0;
				
			}
			empwage = emphrs*EmpRatePerHour;
			totalEmpwage += empwage;
			System.out.println("empwage:"+empwage);
			
			
		}
		System.out.println("Total Emp Wage:"+totalEmpwage);
	}
		

}
