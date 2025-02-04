package ObserverPattern.Observable;

import ObserverPattern.Observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservableImpl implements StocksObservable{

    private List<NotificationAlertObserver> observerList = new ArrayList<>();
    int stocksAdded = 0;
    @Override
    public void addObserver(NotificationAlertObserver observer) {
        observerList.add(observer);

    }

    @Override
    public void removeObserver(NotificationAlertObserver observer) {
        observerList.remove(observer);

    }

    @Override
    public void notifyObservers() {
        for (NotificationAlertObserver observer : observerList) {
            observer.update();
        }

    }

    @Override
    public void setStockCount(int count) {
            if(stocksAdded == 0){
                notifyObservers();
            }
            stocksAdded = stocksAdded + count;
    }

    @Override
    public int getStockCount() {
        return stocksAdded;
    }
}
