package factory;

public class EmployeeFactory {

    public Employee getEmployee(String employeeType){
        if(employeeType==null){
            return null;
        }
        if(employeeType.equalsIgnoreCase("WebDeveloper")){
            return new WebDeveloper();
        } else if(employeeType.equalsIgnoreCase("AndroidDeveloper")){
            return new AndroidDeveloper();
        }
        return null;
    }
}
