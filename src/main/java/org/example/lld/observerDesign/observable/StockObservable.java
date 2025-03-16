package org.example.lld.observerDesign.observable;

import org.example.lld.observerDesign.observer.NotificationAlertObserver;

public interface StockObservable {

    public void add(NotificationAlertObserver notificationAlertObserver);
    public void remove(NotificationAlertObserver notificationAlertObserver);
    public void notifySubscriber();
    public void setStockCount(int newStockAdded);
    public int getStockCount();
}
