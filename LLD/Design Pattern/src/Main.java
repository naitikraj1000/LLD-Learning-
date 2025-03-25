import factory.Employee;
import factory.EmployeeFactory;
import singleton.Singleton;

public class Main {
    public static void main(String[] args) {
        System.out.println(" Design Pattern");
        // SINGLETON DESIGN PATTERN
//        Singleton instance1 = Singleton.getInstance("password");
//        Singleton instance2 = Singleton.getInstance("password");
//        Singleton instance3 = Singleton.getInstance("password");

        // FACTORY DESIGN PATTERN
        EmployeeFactory EmployeeFactory=new EmployeeFactory();
        Employee employee = EmployeeFactory.getEmployee("WebDeveloper");
        System.out.println(employee.Salary());

    }
}