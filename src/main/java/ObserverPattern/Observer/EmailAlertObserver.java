package ObserverPattern.Observer;

import ObserverPattern.Observable.StocksObservable;

public class EmailAlertObserver implements NotificationAlertObserver {

    private StocksObservable stocksObservable;
    String emailId;

    public EmailAlertObserver(StocksObservable stocksObservable, String emailId) {
        this.stocksObservable = stocksObservable;
        this.emailId = emailId;
    }
    @Override
    public void update() {
        sendEmail(emailId,"Product is in Stock Hurry Up");
    }

    private void sendEmail(String emailId, String s) {

        System.out.println("Sending email to " + emailId);
    }
}
