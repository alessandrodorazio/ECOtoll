package veicolo;

public class VeicoloPesante extends Veicolo implements Pesante {

    public char classeTariffaria;

    public VeicoloPesante(int tipoVeicolo, String modello, String marca, String anno, String targa, String classeAmbientale, int numAssi, int peso, int altezza){
        super(tipoVeicolo, modello,marca,anno,targa, classeAmbientale, numAssi,peso,altezza);
        this.classeTariffaria = getClasseTariffaria();
    }

    public char setClasseTariffaria(){

    }
}