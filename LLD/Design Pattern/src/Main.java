import singleton.Singleton;

public class Main {
    public static void main(String[] args) {
        System.out.println(" Design Pattern");
        Singleton instance1 = Singleton.getInstance("password");
        Singleton instance2 = Singleton.getInstance("password");
        Singleton instance3 = Singleton.getInstance("password");

    }
}