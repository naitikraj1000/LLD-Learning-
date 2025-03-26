package observer;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel implements Subject{

    List<Observer> subscribers = new ArrayList<>();


    @Override
    public void subscribe(Observer ob) {
        this.subscribers.add(ob);
    }

    @Override
    public void unsubscribe(Observer ob) {
        this.subscribers.remove(ob);
    }

    @Override
    public void notifyChanges() {
        System.out.println(" New Video Uploaded  Please Check ");
        for (Observer ob : subscribers) {
            ob.notified();
        }
    }
}
