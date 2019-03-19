package veicolo;

public class VeicoloLeggero extends Veicolo implements Leggero {

    public VeicoloLeggero(String modello, String marca, int anno, String classeAmbientale, String targa, int numAssi, int peso, int altezza){
        super(modello,marca,anno,classeAmbientale,targa,numAssi,peso,altezza);
    }

}