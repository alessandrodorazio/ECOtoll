package veicolo;

public class VeicoloPesante extends Veicolo implements InterfacciaVeicolo {

    public char classeTariffaria;

    public VeicoloPesante(String modello, String marca, int anno, String targa, String classeAmbientale, int assi, int peso, int altezza){
        super(modello,marca,anno,targa, classeAmbientale, assi,peso,altezza);
        if(assi <= 2) throw new Error("Il numero di assi deve essere maggiore o uguale a 2!"); //un veicolo pesante deve avere almeno 2 assi
        this.classeTariffaria = this.getClasseTariffaria();
    }

    public char getClasseTariffaria() {
        int assi = (this.assi>5)?5:this.assi;
        return ((assi==2)?'B':(char)(assi+'0'));
    }

    public int getClasseTariffariaInt() { return (this.assi>5)?5:this.assi; }

}