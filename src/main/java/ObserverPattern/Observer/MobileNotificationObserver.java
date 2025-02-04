package ObserverPattern.Observer;

import ObserverPattern.Observable.StocksObservable;

public class MobileNotificationObserver implements NotificationAlertObserver{

    private StocksObservable stocksObservable;
    private int mobileNo;

    public MobileNotificationObserver(StocksObservable stocksObservable, int mobileNo) {
        this.stocksObservable = stocksObservable;
        this.mobileNo = mobileNo;
    }
    @Override
    public void update() {

        sendMessage( mobileNo, "Product is in Stock Hurry Up");

    }

    public void sendMessage(int mobile, String message) {
        System.out.println(mobileNo + ": " + message);
    }


}
