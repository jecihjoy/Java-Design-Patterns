package javadesignpatterns.ObserverDesignPattern;

/**
 *
 * @author developer
 */
public class StockObserver implements Observer{
    
    private double ibmPrice;
    private double googlePrice;
    private double aplePrice;
    
    //static used as a counter
    private static int observerIdTracker = 0;
    
    //for tracking  observers
    private int observerId;
    
    private Subject stockGrabber;

    public StockObserver(Subject stockGrabber) {
        this.stockGrabber = stockGrabber;
        this.observerId = ++ observerIdTracker;
        System.out.print("New Observer" + this.observerId);
        stockGrabber.registerObserver(this);
    }

    
    
    @Override
    public void update(double ibmPrice, double googlePrice, double aplePrice) {
        this.ibmPrice = ibmPrice;
        this.googlePrice = googlePrice;
        this.aplePrice = aplePrice;
        
        printPrices();
    }
    
    public void printPrices() {
        System.out.print("ObseverId:  " +this.observerId + "\n\nGoogle Price: " +this.googlePrice + "\n" + 
                "Ibm Price: " + this.ibmPrice + "\n" + 
                "Apple price: " +this.aplePrice + "\n\n");
    }
    
}
