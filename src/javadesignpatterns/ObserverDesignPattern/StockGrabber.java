package javadesignpatterns.ObserverDesignPattern;

import java.util.ArrayList;

/**
 *
 * @author developer
 */
public class StockGrabber implements Subject {

    private ArrayList<Observer> observers;
    private double ibmPrice;
    private double googlePrice;
    private double aplePrice;

    public StockGrabber() {
        this.observers = new ArrayList<Observer>();
    }

    
    @Override
    public void registerObserver(Observer newObserver) {
        observers.add(newObserver);
    }

    @Override
    public void unregisterObserver(Observer deleteObserver) {
        int observerIndex = observers.indexOf(deleteObserver);

        observers.remove(observerIndex);
    }

    @Override
    public void notyfyObserver() {
        for (Observer ob : observers) {
            ob.update(ibmPrice, googlePrice, aplePrice);
        }
    }

    public void setIbmPrice(double ibmPrice) {
        this.ibmPrice = ibmPrice;
        notyfyObserver();
    }

    public void setGooglePrice(double googlePrice) {
        this.googlePrice = googlePrice;
        notyfyObserver();
    }

    public void setAplePrice(double aplePrice) {
        this.aplePrice = aplePrice;
        notyfyObserver();
    }

}
