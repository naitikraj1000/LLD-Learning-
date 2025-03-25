package singleton;

public class Singleton {
    public  static volatile Singleton instance;
    private  String data;

    private  Singleton(String data){
        this.data=data;
    }

    public  static Singleton getInstance(String data){
        if(instance==null){
            synchronized (Singleton.class){
                if(instance==null){
                    System.out.println("Instance Created ");
                    instance=new Singleton(data);
                }
            }
        }
        return  instance;
    }
}
