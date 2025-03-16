package org.example.lld.observerDesign.observable;

import org.example.lld.observerDesign.observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservableImpl implements StockObservable{

    public List<NotificationAlertObserver> observerlist=new ArrayList<>();
    public int stockCount=0;
    @Override
    public void add(NotificationAlertObserver notificationAlertObserver) {
        observerlist.add(notificationAlertObserver);
    }

    @Override
    public void remove(NotificationAlertObserver notificationAlertObserver) {
        observerlist.remove(notificationAlertObserver);
    }

    @Override
    public void notifySubscriber() {
        for(NotificationAlertObserver observer: observerlist){
            observer.update();
        }

    }

    @Override
    public void setStockCount(int newStockAdded) {
        if(newStockAdded!=0){
            notifySubscriber();
        }
        stockCount=stockCount+newStockAdded;
    }

    @Override
    public int getStockCount() {
        return stockCount;
    }
}
