package veicolo;

public class Veicolo {
    public String modello, marca, targa, classeAmbientale;
    public int numAssi, anno, peso, altezza; //peso in kg, altezza in cm

    public Veicolo(String modello, String marca, int anno, String targa, String classeAmbientale, int numAssi, int peso, int altezza) {
        this.modello = modello;
        this.marca = marca;
        this.targa = targa;
        this.classeAmbientale = classeAmbientale;
        this.anno = anno;
        this.numAssi = numAssi;
        this.peso = peso;
        this.altezza = altezza;
    }

    public static Veicolo nuovoVeicolo(String modello, String marca, int anno, String targa, String classeAmbientale, int numAssi, int peso, int altezza) {
        Veicolo v;
        if(numAssi <= 1) throw new Error("Il numero di assi deve essere maggiore o uguale a 2");
        if(numAssi == 2 && altezza <= 130)
            v = new VeicoloLeggero(modello,marca,anno,targa,classeAmbientale,numAssi,peso,altezza);
        else
            v = new VeicoloPesante(modello,marca,anno,targa,classeAmbientale,numAssi,peso,altezza);

        return v;
    }

    public char getClasseTariffaria() {
        int numAssi = (this.numAssi>5)?5:this.numAssi;
        return (this instanceof VeicoloLeggero)?'A':((numAssi==2)?'B':(char)(numAssi+'0'));
    }

    public int getClasseTariffariaInt() {
        int numAssi = (this.numAssi>5)?5:this.numAssi;
        return (this instanceof VeicoloLeggero)?1:((numAssi==2)?2:numAssi);
    }

    public static char getClasseTariffaria(Veicolo obj) {
        int numAssi = (obj.numAssi>5)?5:obj.numAssi;
        return (obj instanceof VeicoloLeggero)?'A':((numAssi==2)?'B':(char)(numAssi+'0'));
    }

    public int getClasseAmbientaleInt() {
        int classe = (classeAmbientale.charAt(classeAmbientale.length() - 1)) - 48;
        return classe;
    }

    public String getModello() { return modello; }
    public String getMarca() { return marca; }
    public int getAnno() { return anno; }
    public String getTarga() { return targa; }
    public int getPeso() { return peso; }
    public int getAltezza() { return altezza; }


    @Override
    public String toString() {
        return "Veicolo{" +
                "modello='" + modello + '\'' +
                ", marca='" + marca + '\'' +
                ", targa='" + targa + '\'' +
                ", classeAmbientale='" + classeAmbientale + '\'' +
                ", numAssi=" + numAssi +
                ", anno=" + anno +
                ", peso=" + peso +
                ", altezza=" + altezza +
                '}';
    }

}

interface Leggero {

}

interface Pesante {
    float[] pedaggioExtra = { 0f, 0f, 0f, 0f }; //Classe B,3,4,5 . Pedaggio per normativa dal 2021
    float getPedaggioExtra();
}

