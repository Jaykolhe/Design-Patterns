package observer.Observer.ObserverImpl;

import observer.Observer.Observer;

public class NewsChannel implements Observer {

    public String channel;

    public NewsChannel(String channel) {
        this.channel = channel;
    }

    @Override
    public void update(String message) {

        System.out.println(channel + " Recieved News: " + message);

    }
}
