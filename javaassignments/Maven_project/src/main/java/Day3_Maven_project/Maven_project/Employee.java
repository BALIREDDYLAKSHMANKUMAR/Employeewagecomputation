package Day3_Maven_project.Maven_project;

public class Employee {
	public static final int IsFullTime = 1;
	public static final int IsPartTime = 2;
	public static final int EmpRatePerHour = 20;
	public static final int NumOfWorkingDays = 20;
	public static final int MaxHrsInMonth = 10;
	public static void main(String[] args) {
		int emphrs =0,totalEmphrs=0,totalWorkingDays=0;
		while(totalEmphrs <= MaxHrsInMonth && totalWorkingDays <NumOfWorkingDays) {
			totalWorkingDays ++;
			int empcheck = (int)Math.floor(Math.random()*10)%3;
			switch (empcheck){
			case IsFullTime:
				emphrs =8;
				break;
			case IsPartTime:
				emphrs =4;
				break;
			default:
				emphrs = 0;
				
			}
			totalEmphrs += emphrs;
			System.out.println("day#"+totalWorkingDays+"emphrs:"+emphrs);
		}
		int totalEmpWage = totalEmphrs*EmpRatePerHour;
		System.out.println("Total Emp Wage:"+totalEmpWage);
	}
	
}
	
	
			
			
		

