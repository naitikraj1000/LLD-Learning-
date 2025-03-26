package observer;

public class Subscriber implements Observer{
    @Override
    public void notified() {
        System.out.println(" Notified Subscriber ");
    }
}
