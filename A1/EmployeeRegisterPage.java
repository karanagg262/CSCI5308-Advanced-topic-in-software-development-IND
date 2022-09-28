import java.util.*;

public class EmployeeRegisterPage {
	
	static Scanner sc = new Scanner(System.in);
	static EmployeeRegistration employeeRegister = new EmployeeRegistration();
	static List<EmployeeRegistration> list = new ArrayList<>();
	
// If the user chose register a new employee
	public static void takeInput() {
    	System.out.println("Enter Employee ID");
    	String id = sc.nextLine();
    	System.out.println("Enter Employee First name");
    	String fn = sc.nextLine();
    	System.out.println("Enter Employee Last name");
    	String ln = sc.nextLine();
    	System.out.println("Enter Employee Designation");
    	String designation = sc.nextLine();
    	System.out.println("Enter Number of years of experience of employee");
    	String nof = sc.nextLine();
    	nof = checkNumberOfYearsOfExperience(nof);
    	System.out.println("Enter Employee Blood Group");
    	String bg = sc.nextLine();
    	System.out.println("Enter Employee ID card Number");
    	String idcard = sc.nextLine();
    	System.out.println("Enter Employee Gender (M/F/Male/Female/Other)");
    	String gender = sc.nextLine();
    	gender = checkGender(gender);
    	System.out.println("Enter Employee Pronoun (He/She/They/It)");
    	String pronoun = sc.nextLine();
    	pronoun = checkPronoun(pronoun);
    	System.out.println("Enter Employee Address");
    	String address = sc.nextLine();
    	System.out.println("Enter Employee Mobile Number");
    	String mobileno = sc.nextLine();
    	mobileno = checkMobile(mobileno);
    	System.out.println("Thank you for details");
    	SetEmployeeData(id, fn, ln, designation, nof, bg, idcard, gender, pronoun, address, mobileno);
	}
	
//  Checking if the correct form of Gender is inserted
	public static String checkGender(String gender) {
		while(!gender.toUpperCase().equals("M") && !gender.toUpperCase().equals("F") &&
				!gender.toUpperCase().equals("MALE") && !gender.toUpperCase().equals("FEMALE")
				&& !gender.toUpperCase().equals("OTHER")) {			
			System.out.println("Please Enter a valid Gender:");
			gender = sc.nextLine();
		}
		return gender;		
	}

//  Checking if the correct form of BloodGroup is inserted
	public static String checkBloodGroup(String bg) {
		while(!bg.toUpperCase().equals("A+") && !bg.toUpperCase().equals("A-") &&
				!bg.toUpperCase().equals("B+") && !bg.toUpperCase().equals("B-")
				&& !bg.toUpperCase().equals("AB+") && !bg.toUpperCase().equals("AB-") &&
				!bg.toUpperCase().equals("O+") && !bg.toUpperCase().equals("O-")) {
			
			System.out.println("Please Enter a valid Blood Group:" + bg.toUpperCase());
			bg = sc.nextLine();
		}
		return bg;
	}
	
//  Checking if the correct form of Pronoun is inserted
	public static String checkPronoun(String pronoun) {
		while(!pronoun.toUpperCase().equals("HE") && !pronoun.toUpperCase().equals("SHE") &&
				!pronoun.toUpperCase().equals("THEY") && !pronoun.toUpperCase().equals("IT")) {
			
			System.out.println("Please Enter a valid Pronoun:");
			pronoun = sc.nextLine();
		}
		return pronoun;
	}
	
//  Checking if the correct form of Number of Experience is inserted
	public static String checkNumberOfYearsOfExperience(String number) {
		while(!number.matches("[0-9]+")) {
			System.out.println("Please Enter a valid Experience Number:");
			number = sc.nextLine();
		}
		return number;
	}
	
//  Checking if the correct form of Mobile Number is inserted
	public static String checkMobile(String number) {
		while(!number.matches("[0-9]+")) {
			System.out.println("Please Enter a valid Mobile Number:");
			number = sc.nextLine();
		}
		return number;
	}
	
//  Adding all the registered employee to list
    public static void SetEmployeeData(String id, String fn, String ln, String designation,
    		String nof,String bg,String idcard,String gender, String pronoun, String address
    		, String mobileno)
    {
		employeeRegister.setEmployeeId(id); 
		employeeRegister.setEmployeeFirstName(fn);
		employeeRegister.setEmployeeLastName(ln);
		employeeRegister.setEmployeeDesignation(designation);
		employeeRegister.setEmployeeNumberOfExperience(nof);
		employeeRegister.setEmployeeBloodGroup(bg);
		
		employeeRegister.setEmployeeSINNumber(idcard);
		
		employeeRegister.setEmployeeGender(gender);
		
		employeeRegister.setEmployeePronoun(pronoun);
		
		employeeRegister.setEmployeeAddress(address);
		
		employeeRegister.setEmployeeMobile(mobileno);
			
		list.add(employeeRegister);
		
		ShowSpecificEmployee(id);
		
		try {
			UserDB userDB = new UserDB();
			userDB.save(list);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
   
//  Return entire list for Employee
    public static List<EmployeeRegistration> SaveEmployeeData(){
        return list;
    }
 
//  If the user chose edit an existing employee
    public static void editEmployeePage() {
		System.out.println("Enter Employee ID");
		String id = sc.nextLine();
		for(int i=0;i<list.size();i++) {
			if(id.equals(list.get(i).getEmployeeId())) {
				System.out.println("Enter the options you want to modify:");
				System.out.println("1. First name");
				System.out.println("2. Last name");
				System.out.println("3. Employee Designation");
				System.out.println("4. Number of years of experience of employee");
				System.out.println("5. Blood Group");
				System.out.println("6. ID card Number");
				System.out.println("7. Gender");
				System.out.println("8. Pronoun");
				System.out.println("9. Address");
				System.out.println("10. Mobile Number");
				int input = sc.nextInt();
				System.out.println("Please Input:");
				String editFeature = sc.next();
				EditEmployeeData(i, input, editFeature);
				break;
			}
		}
    }

//  If the user chose delete an existing employee
    public static void deleteEmployeePage() {
		if(list.size()<1) {
			System.out.println("No Employee present in database");
			System.exit(1);
		}
		System.out.println("Enter Employee ID");
		String id = sc.nextLine();
		for(int i=0;i<list.size();i++) {
			if(id.equals(list.get(i).getEmployeeId())) {
				list.remove(i);
			}
		}
    }
    
//  Updating database for editing an existing employee
    public static void EditEmployeeData(int i, int input, String editFeature) {
				switch (input) {
				case 1:
					list.get(i).setEmployeeFirstName(editFeature);
					break;
				case 2:
					list.get(i).setEmployeeLastName(editFeature);
					break;
				case 3:
					list.get(i).setEmployeeDesignation(editFeature);
					break;
				case 4:
					list.get(i).setEmployeeNumberOfExperience(editFeature);
					break;
				case 5:
					list.get(i).setEmployeeBloodGroup(editFeature);
					break;
				case 6:
					list.get(i).setEmployeeSINNumber(editFeature);
					break;
				case 7:
					list.get(i).setEmployeeGender(editFeature);
					break;
				case 8:
					list.get(i).setEmployeePronoun(editFeature);
					break;
				case 9:
					list.get(i).setEmployeeAddress(editFeature);
					break;
				case 10:
					list.get(i).setEmployeeMobile(editFeature);
					break;
				default:
					System.exit(1);
				}
	}

//  If the user chose show entire employee directory
    public static void ShowAllEmployee()
    {
		for(int i=0;i<list.size();i++) {
			PrintData(i);
		}
    }
    
//  If the user wants to see a specific employee
    public static void ShowSpecificEmployee(String id)//List<employeeRegistration> list
    {
		for(int i=0;i<list.size();i++) {
			if(id.equals(list.get(i).getEmployeeId())) {
				PrintData(i);
			}
			else {
				System.out.println("Not found");
			}
		}
    }

//	Code to print entire list
    public static void PrintData(int i) {
    	System.out.println(i);
		System.out.println(list.get(i).getEmployeeId());
		System.out.println(list.get(i).getEmployeeFirstName());
		System.out.println(list.get(i).getEmployeeLastName());
		System.out.println(list.get(i).getEmployeeDesignation());
		System.out.println(list.get(i).getEmployeeNumberOfExperience());
		System.out.println(list.get(i).getEmployeeBloodGroup());
		System.out.println(list.get(i).getEmployeeIdentificationNumber());
		System.out.println(list.get(i).getEmployeeGender());
		System.out.println(list.get(i).getEmployeePronoun());
		System.out.println(list.get(i).getEmployeeAddress());
		System.out.println(list.get(i).getEmployeeMobile());    	
    }
}