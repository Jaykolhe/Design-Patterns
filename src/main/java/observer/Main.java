package observer;

import observer.Observable.ObservableImpl.NewsAgency;
import observer.Observer.ObserverImpl.NewsChannel;


public class Main {

    public static void main(String[] args) {
        NewsAgency newsAgency = new NewsAgency();

        NewsChannel channel1 = new NewsChannel("Abp Maza");
        NewsChannel channel2 = new NewsChannel("Aaj Tak");

        newsAgency.addObserver(channel1);
        newsAgency.addObserver(channel2);

        newsAgency.setChange("India Won Champions Trophy 2025");

    }
}