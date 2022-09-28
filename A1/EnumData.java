import java.util.List;

public interface EnumData {

//	Enum data to print test failures or success
    public enum SystemPrint
    {
    	SUCCESS,
        FAILURE,
        DOES_NOT_EXIST
    }
    
    public SystemPrint save(List<EmployeeRegistration> employeeRegister) throws Exception;
}
