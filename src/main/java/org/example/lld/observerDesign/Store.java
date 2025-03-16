package org.example.lld.observerDesign;

import org.example.lld.observerDesign.observable.IphoneObservableImpl;
import org.example.lld.observerDesign.observable.StockObservable;
import org.example.lld.observerDesign.observer.EmailAlertObserverImpl;
import org.example.lld.observerDesign.observer.MobileAlertObserverImpl;
import org.example.lld.observerDesign.observer.NotificationAlertObserver;

public class Store {

    public static void main(String[] args) {
        StockObservable iphoneStockObservable = new IphoneObservableImpl();
        NotificationAlertObserver notificationAlertObserverEmail=new EmailAlertObserverImpl("saket.sharma@test.com", iphoneStockObservable);
        NotificationAlertObserver notificationAlertObserverMobile=new MobileAlertObserverImpl("480-1234-5678", iphoneStockObservable);

        iphoneStockObservable.add(notificationAlertObserverEmail);
        iphoneStockObservable.add(notificationAlertObserverMobile);

        iphoneStockObservable.setStockCount(5);
    }
}
