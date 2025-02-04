package ObserverPattern;

import ObserverPattern.Observable.IphoneObservableImpl;
import ObserverPattern.Observable.StocksObservable;
import ObserverPattern.Observer.EmailAlertObserver;
import ObserverPattern.Observer.MobileNotificationObserver;
import ObserverPattern.Observer.NotificationAlertObserver;

public class Store {

    public static void main(String[] args) {


        StocksObservable observable = new IphoneObservableImpl();

        NotificationAlertObserver ob = new EmailAlertObserver(observable,"Kolhe3@gmail.com");
        NotificationAlertObserver ob2 = new EmailAlertObserver(observable,"Kolhe7@gmail.com");
        NotificationAlertObserver ob3 = new MobileNotificationObserver(observable,9022846);
        observable.addObserver(ob);
        observable.addObserver(ob2);
        observable.addObserver(ob3);

        observable.setStockCount(10);
       // System.out.println(observable.getStockCount());
    }
}
