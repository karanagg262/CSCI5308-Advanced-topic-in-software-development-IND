public class EmployeeRegisterPageTest {

	static EmployeeRegisterPage employeePage = new EmployeeRegisterPage();
	static EmployeeRegistrationTest employeeRegistrationTest = new EmployeeRegistrationTest();
	
//  Load a mock Employee Details to System
	static void loadTest()
	{
		EmployeeRegisterPage.SetEmployeeData("9834223", "Karan", "Aggarwal", "SDE", "4", "B+", 
					"9424253252", "M", "He", "Somerset Apartments", "7828825643");
		System.out.println(EmployeeRegisterPage.SaveEmployeeData().size());
		if(EmployeeRegisterPage.list.size() > 0) {
			System.out.println(EnumData.SystemPrint.SUCCESS);
		} else {
			System.out.println(EnumData.SystemPrint.FAILURE);
		}
		
		EmployeeRegistrationTest.testEmployee(EmployeeRegisterPage.list.get(0));
		
		checkBloodGroupTest();
		checkNumberOfYearsOfExperienceTest();
		checkPronounTest();
		checkMobileTest();
		checkGenderTest();
		
		try {
			EmployeeDBMock userDBMock = new EmployeeDBMock();
			userDBMock.save(EmployeeRegisterPage.list);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
//  Function to Edit Employee with mock data
	static void testEditFeature() {
		EmployeeRegisterPage.EditEmployeeData(0, 1, "Abhinav");
		EmployeeRegistrationTest.testEditFirstName(EmployeeRegisterPage.list.get(0));
		EmployeeRegisterPage.EditEmployeeData(0, 2, "Singh");
		EmployeeRegistrationTest.testEditLastName(EmployeeRegisterPage.list.get(0));
		EmployeeRegisterPage.EditEmployeeData(0, 3, "Clerk");
		EmployeeRegistrationTest.testEditDesignationName(EmployeeRegisterPage.list.get(0));
		EmployeeRegisterPage.EditEmployeeData(0, 4, "0");
		EmployeeRegistrationTest.testEditNumberOfExperience(EmployeeRegisterPage.list.get(0));
		EmployeeRegisterPage.EditEmployeeData(0, 5, "A+");
		EmployeeRegistrationTest.testEditBloodGroup(EmployeeRegisterPage.list.get(0));
		EmployeeRegisterPage.EditEmployeeData(0, 6, "2321412432");
		EmployeeRegistrationTest.testEditSINNumber(EmployeeRegisterPage.list.get(0));
		EmployeeRegisterPage.EditEmployeeData(0, 7, "Male");
		EmployeeRegistrationTest.testEditGender(EmployeeRegisterPage.list.get(0));
		EmployeeRegisterPage.EditEmployeeData(0, 8, "She");
		EmployeeRegistrationTest.testEditPronoun(EmployeeRegisterPage.list.get(0));
		EmployeeRegisterPage.EditEmployeeData(0, 9, "Somerset Apt");
		EmployeeRegistrationTest.testEditAddress(EmployeeRegisterPage.list.get(0));
		EmployeeRegisterPage.EditEmployeeData(0, 10, "96745674575");
		EmployeeRegistrationTest.testEditMobile(EmployeeRegisterPage.list.get(0));
	}

//  Function to test Blood Group check function
	static void checkBloodGroupTest() {
		String value = EmployeeRegisterPage.checkBloodGroup("A+");
		if(value.equals("A+")) {
			System.out.println(EnumData.SystemPrint.SUCCESS);
		} else {
			System.out.println(EnumData.SystemPrint.FAILURE);
		}
	}

//  Function to test Number of years of Experience check function
	static void checkNumberOfYearsOfExperienceTest() {
		String value = EmployeeRegisterPage.checkNumberOfYearsOfExperience("4");
		if (value.equals("4")) {
			System.out.println(EnumData.SystemPrint.SUCCESS);
		} else {
			System.out.println(EnumData.SystemPrint.FAILURE);
		}
	}

//  Function to test Pronoun check function
	static void checkPronounTest() {
		String value = EmployeeRegisterPage.checkPronoun("He");
		if (value.equals("HE")) {
			System.out.println(EnumData.SystemPrint.SUCCESS);
		} else {
			System.out.println(EnumData.SystemPrint.FAILURE);
		}		
	}

//  Function to test Mobile Number check function
	static void checkMobileTest() {
		String value = EmployeeRegisterPage.checkMobile("9876456754");
		if (value.equals("9876456754")) {
			System.out.println(EnumData.SystemPrint.SUCCESS);
		} else {
			System.out.println(EnumData.SystemPrint.FAILURE);
		}
	} 

//  Function to test Gender check function
	static void checkGenderTest() {
		String value = EmployeeRegisterPage.checkGender("M");
		if (value.equals("M")) {
			System.out.println(EnumData.SystemPrint.SUCCESS);
		} else {
			System.out.println(EnumData.SystemPrint.FAILURE);
		}
	} 
}
