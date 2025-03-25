package factory;

public class WebDeveloper implements Employee{
    @Override
    public int Salary() {
        System.out.println("Web Developer Salary");
        return 2000000;
    }
}
