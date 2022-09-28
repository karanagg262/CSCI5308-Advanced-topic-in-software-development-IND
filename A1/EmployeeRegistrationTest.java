
public class EmployeeRegistrationTest {
	
	static EmployeeRegisterPageTest employeeRegisterPageTest = new EmployeeRegisterPageTest();
	
//	Run all the test Employees
	static void testEmployee(EmployeeRegistration employeeRegister) {
		testEmployeeID(employeeRegister.getEmployeeId());
		testEmployeeFirstName(employeeRegister.getEmployeeFirstName());
		testEmployeeLastName(employeeRegister.getEmployeeLastName());
		testEmployeeDesignation(employeeRegister.getEmployeeDesignation());
		testEmployeeNumberofExperience(employeeRegister.getEmployeeNumberOfExperience());
		testEmployeeBloodGroup(employeeRegister.getEmployeeBloodGroup());
		testEmployeeIdentificationNumber(employeeRegister.getEmployeeIdentificationNumber());
		testEmployeeGender(employeeRegister.getEmployeeGender());
		testEmployeePronoun(employeeRegister.getEmployeePronoun());
		testEmployeeAddress(employeeRegister.getEmployeeAddress());
		testEmployeeMobile(employeeRegister.getEmployeeMobile());
	}
	
//	test Employee ID
	static void testEmployeeID(String id){
		if(id.equals("9834223")) {
			System.out.println(EnumData.SystemPrint.SUCCESS);
		} else {
			System.out.println(EnumData.SystemPrint.FAILURE);
		}
	}
	
//	test Employee First Name
	static void testEmployeeFirstName(String firstname){
		if(firstname.equals("Karan")) {
			System.out.println(EnumData.SystemPrint.SUCCESS);
		} else {
			System.out.println(EnumData.SystemPrint.FAILURE);
		}
	}
	
//	test Employee Last Name
	static void testEmployeeLastName(String lastname){
		if(lastname.equals("Aggarwal")) {
			System.out.println(EnumData.SystemPrint.SUCCESS);
		} else {
			System.out.println(EnumData.SystemPrint.FAILURE);
		}
	}
	
//	test Employee Designation
	static void testEmployeeDesignation(String designation){
		if(designation.equals("SDE")) {
			System.out.println(EnumData.SystemPrint.SUCCESS);
		} else {
			System.out.println(EnumData.SystemPrint.FAILURE);
		}
	}
	
//	test Employee Number of Experience
	static void testEmployeeNumberofExperience(String nof){
		if(nof.equals("4")) {
			System.out.println(EnumData.SystemPrint.SUCCESS);
		} else {
			System.out.println(EnumData.SystemPrint.FAILURE);
		}
	}
	
//	test Employee Blood Group
	static void testEmployeeBloodGroup(String bg){
		if(bg.equals("B+")) {
			System.out.println(EnumData.SystemPrint.SUCCESS);
		} else {
			System.out.println(EnumData.SystemPrint.FAILURE);
		}
	}
	
//	test Employee Identifcation Number
	static void testEmployeeIdentificationNumber(String in){
		if(in.equals("9424253252")) {
			System.out.println(EnumData.SystemPrint.SUCCESS);
		} else {
			System.out.println(EnumData.SystemPrint.FAILURE);
		}
	}
	
//	test Employee Gender
	static void testEmployeeGender(String gender){
		if(gender.equals("M")) {
			System.out.println(EnumData.SystemPrint.SUCCESS);
		} else {
			System.out.println(EnumData.SystemPrint.FAILURE);
		}
	}
	
//	test Employee Pronoun
	static void testEmployeePronoun(String pronoun){
		if(pronoun.equals("He")) {
			System.out.println(EnumData.SystemPrint.SUCCESS);
		} else {
			System.out.println(EnumData.SystemPrint.FAILURE);
		}
	}
	
//	test Employee Address
	static void testEmployeeAddress(String address){
		if(address.equals("Somerset Apartments")) {
			System.out.println(EnumData.SystemPrint.SUCCESS);
		} else {
			System.out.println(EnumData.SystemPrint.FAILURE);
		}
	}
	
//	test Employee Mobile
	static void testEmployeeMobile(String mobile){
		if(mobile.equals("7828825643")) {
			System.out.println(EnumData.SystemPrint.SUCCESS);
		} else {
			System.out.println(EnumData.SystemPrint.FAILURE);
		}
	}
	
//	test edit Employee First Name 
	static void testEditFirstName(EmployeeRegistration employeeRegister) {
		if(employeeRegister.getEmployeeFirstName().equals("Abhinav")) {
			System.out.println(EnumData.SystemPrint.SUCCESS);
		} else {
			System.out.println(EnumData.SystemPrint.FAILURE);
		}	
	}
	
//	test edit Employee Last Name 
	static void testEditLastName(EmployeeRegistration employeeRegister) {
		if(employeeRegister.getEmployeeLastName().equals("Singh")) {
			System.out.println(EnumData.SystemPrint.SUCCESS);
		} else {
			System.out.println(EnumData.SystemPrint.FAILURE);
		}		
	}
	
//	test edit Employee Designation
	static void testEditDesignationName(EmployeeRegistration employeeRegister) {
		if(employeeRegister.getEmployeeDesignation().equals("Clerk")) {
			System.out.println(EnumData.SystemPrint.SUCCESS);
		} else {
			System.out.println(EnumData.SystemPrint.FAILURE);
		}
	}
	
//	test edit Employee Number of years of Experience
	static void testEditNumberOfExperience(EmployeeRegistration employeeRegister) {
		if(employeeRegister.getEmployeeNumberOfExperience().equals("0")) {
			System.out.println(EnumData.SystemPrint.SUCCESS);
		} else {
			System.out.println(EnumData.SystemPrint.FAILURE);
		}		
	}
	
//	test edit Employee Blood Group
	static void testEditBloodGroup(EmployeeRegistration employeeRegister) {
		if(employeeRegister.getEmployeeBloodGroup().equals("A+")) {
			System.out.println(EnumData.SystemPrint.SUCCESS);
		} else {
			System.out.println(EnumData.SystemPrint.FAILURE);
		}		
	}
	
//	test edit Employee SIN Number
	static void testEditSINNumber(EmployeeRegistration employeeRegister) {
		if(employeeRegister.getEmployeeIdentificationNumber().equals("2321412432")) {
			System.out.println(EnumData.SystemPrint.SUCCESS);
		} else {
			System.out.println(EnumData.SystemPrint.FAILURE);
		}		
	}
	
//	test edit Employee Gender
	static void testEditGender(EmployeeRegistration employeeRegister) {
		if(employeeRegister.getEmployeeGender().equals("Male")) {
			System.out.println(EnumData.SystemPrint.SUCCESS);
		} else {
			System.out.println(EnumData.SystemPrint.FAILURE);
		}		
	}
	
//	test edit Employee Pronoun
	static void testEditPronoun(EmployeeRegistration employeeRegister) {
		if(employeeRegister.getEmployeePronoun().equals("She")) {
			System.out.println(EnumData.SystemPrint.SUCCESS);
		} else {
			System.out.println(EnumData.SystemPrint.FAILURE);
		}		
	}
	
//	test edit Employee Address
	static void testEditAddress(EmployeeRegistration employeeRegister) {
		if(employeeRegister.getEmployeeAddress().equals("Somerset Apt")) {
			System.out.println(EnumData.SystemPrint.SUCCESS);
		} else {
			System.out.println(EnumData.SystemPrint.FAILURE);
		}		
	}
	
//	test edit Employee Mobile
	static void testEditMobile(EmployeeRegistration employeeRegister) {
		if(employeeRegister.getEmployeeMobile().equals("96745674575")) {
			System.out.println(EnumData.SystemPrint.SUCCESS);
		} else {
			System.out.println(EnumData.SystemPrint.FAILURE);
		}		
	}
}
