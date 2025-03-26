import factory.Employee;
import factory.EmployeeFactory;
import observer.Subscriber;
import observer.YoutubeChannel;
import singleton.Singleton;
import builder.User;
import strategy.Context;
import strategy.OperationAdd;
import strategy.OperationMultiply;

public class Main {
    public static void main(String[] args) {
        System.out.println(" Design Pattern");
        // SINGLETON DESIGN PATTERN
//        Singleton instance1 = Singleton.getInstance("password");
//        Singleton instance2 = Singleton.getInstance("password");
//        Singleton instance3 = Singleton.getInstance("password");

        // FACTORY DESIGN PATTERN
//        EmployeeFactory EmployeeFactory=new EmployeeFactory();
//        Employee employee = EmployeeFactory.getEmployee("WebDeveloper");
//        System.out.println(employee.Salary());

        // BUILDER DESIGN PATTERN

//       User user=new User.UserBuilder().setEmailId("xyz@gmail.com").setUserId("123").setUserName("xyz").build();
//        System.out.println(user.getEmailId());
//        System.out.println(user.getUserId());
//        System.out.println(user.getUserName());


        // STRATEGY DESIGN PATTERN

//        Context context = new Context(new OperationAdd());
//        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));
//
//        context = new Context(new OperationMultiply());
//        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));


//        YoutubeChannel channel= new YoutubeChannel();
//        Subscriber pidi=new Subscriber();
//
//        channel.subscribe(pidi);
//
//        channel.notifyChanges();


    }
}