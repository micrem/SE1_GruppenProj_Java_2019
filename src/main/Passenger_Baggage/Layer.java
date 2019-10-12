package Passenger_Baggage;

public class Layer {

    private String layerText;
    private HandBaggage handBaggage;

    public Layer(String layerText, HandBaggage handBaggage){
        this.layerText = layerText;
        this.handBaggage =handBaggage;
        handBaggage.setLayer1(this);
        handBaggage.setLayer2(this);
        handBaggage.setLayer3(this);
        handBaggage.setLayer4(this);
        handBaggage.setLayer5(this);
    }
}
