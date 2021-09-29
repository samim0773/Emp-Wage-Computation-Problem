public class EmpWageCom{
	public static void main(String args []){
		System.out.println("Welcome to Employee Wage Computation Program");
		// calling CheckEmp method
		CheckEmp();
		
		
	}
	// Create a method for checkemp
	public static void CheckEmp(){
		
		// initialize and declar a emp_is_present variable 
		int emp_is_present=1;
		
		//take the random value
		double checkEmp = Math.floor(Math.random()*10)%2;
		
		//check the codition emp is present or not 
		if(checkEmp == emp_is_present)
		{
			System.out.println("Employee is Present");
			
			// calling CalDailyEmpWage 
			CalDailyEmpWage();
		}
		else
			System.out.println("Emplyee is Absent");
	}
	
	// create a method for daily emp wage
	public static void CalDailyEmpWage(){
		
		//declar variable and initialize value
		int Wage_Per_Hour = 20;
		int Full_Day_Hour = 8;
		
		// calculate daily wage
		int total_Wage = Wage_Per_Hour * Full_Day_Hour;
		
		//Print total Wage per Day
		System.out.println("Daily Employee Wage : " + total_Wage);
		
	}
	
	
}