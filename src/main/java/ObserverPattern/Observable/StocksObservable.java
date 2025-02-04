package ObserverPattern.Observable;


import ObserverPattern.Observer.NotificationAlertObserver;

public interface StocksObservable {

   void addObserver(NotificationAlertObserver observer);
   void removeObserver(NotificationAlertObserver observer);
   void notifyObservers();
   void setStockCount(int count);
   int getStockCount();
}
