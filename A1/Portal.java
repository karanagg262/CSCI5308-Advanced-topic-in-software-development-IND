import java.util.*;

public class Portal {

	static Scanner sc = new Scanner(System.in);
	static EmployeeRegisterPage employeePage = new EmployeeRegisterPage();
	
//  Main function which is running portal 
	public static void RepeatPortal() {
		while(true) {
			EmployeeMainPortal();
	        if (!UserContinue()) {
	            break;
	        }
		}
	}
	
//  If the user wants to continue after completing a task
	private static boolean UserContinue() {
	    System.out.println("Do you want to continue with main page? (y/n): ");
	    String input = sc.next();
	    return input.toLowerCase().equals("y");
	}
	
//  Main portal where user gets the option to choose from list of tasks
	public static void EmployeeMainPortal()
    {
    	System.out.println("1. Register a new Employee");
    	System.out.println("2. Search an Employee");
    	System.out.println("3. Show Employee Directory");
    	System.out.println("4. Edit Employee details");
    	System.out.println("5. Remove Employee from Database");
    	int option = sc.nextInt();
		switch(option) {
		case 1:
			EmployeeRegisterPage.takeInput();
			break;
		case 2:
	    	System.out.println("Enter Employee ID: ");
	    	String id = sc.next();
			EmployeeRegisterPage.ShowSpecificEmployee(id);
			break;
		case 3:
			EmployeeRegisterPage.ShowAllEmployee();
			break;
		case 4:
			EmployeeRegisterPage.editEmployeePage();
			break;
		case 5:
			EmployeeRegisterPage.deleteEmployeePage();
			break;
		default:
			System.exit(1);
		}
    }
}
