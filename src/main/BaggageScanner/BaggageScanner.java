package BaggageScanner;


import java.util.Map;

public class BaggageScanner implements IBaggageScanner {
    private StatusBaggageScanner status;
    private ProhibitedItems verbotendeGegen;

    public BaggageScanner (){
        this.status = StatusBaggageScanner.shutdown;

    }



}
