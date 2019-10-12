package Passenger_Baggage;

public class HandBaggage {

    //fuer 1 zu 5 verkuepfung
    private Layer[] layers;


    private String baggageText;
    private String[] layerTexts;


    public HandBaggage(String baggageText){
        this.baggageText = baggageText;
        this.layers = new Layer[5];
        this.layerTexts = new String[5];

        for (int i=0;i<=5;i++) {
            layerTexts[i] = baggageText.substring(i*10000, i*10000 + 10000);
            layers[i] = new Layer(layerTexts[i],this);
        }

    }

    public Layer getLayer(int index){
        if (index>=0 && index<layers.length) {
            return layers[index];
        } else {
            return null;
        }
    }

}
