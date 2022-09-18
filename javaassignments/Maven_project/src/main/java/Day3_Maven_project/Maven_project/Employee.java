package Day3_Maven_project.Maven_project;

public class Employee {
	final static int IsFullTime = 1;
    final static int IspartTime=2;
    final static int EmpRatePerHour=20;

public static void main(String[] args) {
	int emphrs=0;
	int empwage=0;
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
	empwage = emphrs * EmpRatePerHour;
	System.out.println("EmpWage:"+empwage);
}
	
	
			
			
		
}
