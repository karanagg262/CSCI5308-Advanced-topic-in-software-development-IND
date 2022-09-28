import java.util.List;

public class EmployeeDBMock implements EnumData{
	
	// Mock saving to DB
	public SystemPrint save(List<EmployeeRegistration> employeeRegister) throws Exception
	{
		return SystemPrint.SUCCESS;
	}
	
	
	public SystemPrint LoadMultiple(String employeeID, EmployeeRegistration employeeRegistration)
	{
		if (employeeID.equals("9834223"))
		{
			return SystemPrint.SUCCESS;
		}
		else {
			
		}
		return SystemPrint.FAILURE;
	}
}