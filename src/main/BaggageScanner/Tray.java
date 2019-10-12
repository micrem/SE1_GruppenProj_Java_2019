package BaggageScanner;

import Passenger_Baggage.HandBaggage;

public class Tray {
    private BaggageScanner baggageScanner;

    private HandBaggage baggage;

    public HandBaggage getBaggage() {
        return baggage;
    }

    public void setBaggage(HandBaggage baggage) {
        this.baggage = baggage;
    }

    public Tray(BaggageScanner baggageScanner){
        this.baggageScanner = baggageScanner;
        baggageScanner.setTray(this);

    }

}
