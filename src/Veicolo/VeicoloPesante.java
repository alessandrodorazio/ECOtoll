package veicolo;

public class VeicoloPesante extends Veicolo implements InterfacciaVeicolo {

    private char classeTariffaria;

    public VeicoloPesante(String modello, String marca, int anno, String targa, String classeAmbientale, int assi, int peso, int altezza){
        super(modello,marca,anno,targa, classeAmbientale, assi,peso,altezza);
        this.classeTariffaria = this.calcoloClasseTariffaria();
    }

    public char calcoloClasseTariffaria() {
        int assi = (this.assi>5)?5:this.assi;
        return ((assi==2)?'B':(char)(assi+'0'));
    }

    public char getClasseTariffaria() { return this.classeTariffaria; }

    public int getClasseTariffariaInt() { return (this.assi>5)?5:this.assi; }


}