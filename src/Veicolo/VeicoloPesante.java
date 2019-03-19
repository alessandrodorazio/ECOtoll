package veicolo;

public class VeicoloPesante extends Veicolo implements Pesante {

    public char classeTariffaria;

    public VeicoloPesante(String modello, String marca, int anno, String targa, String classeAmbientale, int numAssi, int peso, int altezza){
        super(modello,marca,anno,targa, classeAmbientale, numAssi,peso,altezza);
        if(numAssi < 2) throw new Error("Il numero di assi deve essere maggiore o uguale a 2!");
        this.classeTariffaria = this.getClasseTariffaria();
    }

    public float getPedaggioExtra() { return pedaggioExtra[classeTariffaria - 2]; }

}