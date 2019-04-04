package veicolo;

public class VeicoloLeggero extends Veicolo implements InterfacciaVeicolo {

    public VeicoloLeggero(String modello, String marca, int anno, String classeAmbientale, String targa, int assi, int peso, int altezza){
        super(modello,marca,anno,classeAmbientale,targa,assi,peso,altezza);
    }

    public char getClasseTariffaria() { return 'A'; } //il veicolo leggero è solamente classe A
    public int getClasseTariffariaInt() { return '1'; }

}