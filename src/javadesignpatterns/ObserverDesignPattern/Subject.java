package javadesignpatterns.ObserverDesignPattern;

import java.util.Observable;

/**
 *
 * @author developer
 */
public interface Subject {

    public void registerObserver(Observer observer);

    public void unregisterObserver(Observer observable);

    public void notyfyObserver();

}
