package factory;

public class AndroidDeveloper implements  Employee{
    @Override
    public int Salary() {
        System.out.println("Android Developer Salary");
        return 1000000;
    }

}
