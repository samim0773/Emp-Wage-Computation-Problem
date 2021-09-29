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
			System.out.println("Employee is Present");
		else
			System.out.println("Emplyee is Absent");
	}
}