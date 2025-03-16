package org.example.lld.observerDesign.observer;

import org.example.lld.observerDesign.observable.StockObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver{

    String phoneNum;
    StockObservable stockObservable;
    public MobileAlertObserverImpl(String phoneNum, StockObservable stockObservable){
        this.phoneNum=phoneNum;
        this.stockObservable=stockObservable;
    }
    @Override
    public void update() {
        sendNotification(phoneNum,"product is available in stock");
    }

    private void sendNotification(String phoneNum, String msg){
        System.out.println("Message sent to phone num"+phoneNum);
    }
}
