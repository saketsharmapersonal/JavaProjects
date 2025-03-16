package org.example.lld.observerDesign.observer;

import org.example.lld.observerDesign.observable.StockObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver{
    String emailId;
    StockObservable observable;

    public EmailAlertObserverImpl(String emailId, StockObservable observable){
        this.emailId=emailId;
        this.observable=observable;
    }
    @Override
    public void update() {
        sendEmail(emailId, "product available in stock");

    }
    private void sendEmail(String emailId, String message){
        System.out.println("Mail sent to:" +emailId);
    }
}
