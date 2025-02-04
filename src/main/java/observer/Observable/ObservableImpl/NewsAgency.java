package observer.Observable.ObservableImpl;

import observer.Observer.Observer;

import java.util.ArrayList;
import java.util.List;

interface Observable {

    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
    void setChange(String change);

}

public class NewsAgency implements Observable{

    private List<Observer> observers = new ArrayList<Observer>();
     String news;


    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);

    }

    @Override
    public void notifyObservers() {

        for(Observer observer : observers){
            observer.update(news);
        }

    }

    @Override
    public void setChange(String change) {
        news = change;
        notifyObservers();
    }
}

