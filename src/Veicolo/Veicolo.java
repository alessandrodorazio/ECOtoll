package veicolo;

public class Veicolo {
    public String modello, marca, anno, targa, classeAmbientale;
    public int numAssi, peso, altezza; //peso in kg, altezza in cm

    public Veicolo(int tipoVeicolo, String modello, String marca, String anno, String targa, String classeAmbientale, int numAssi, int peso, int altezza) {
        if(numAssi < 3) throw new Error("Il numero di assi deve essere maggiore o uguale a 3");
        this.modello = modello;
        this.marca = marca;
        this.targa = targa;
        this.classeAmbientale = classeAmbientale;
        this.anno = anno;
        this.numAssi = numAssi;
        this.peso = peso;
        this.altezza = altezza;
    }

    public static char getClasseTariffaria(Veicolo obj) {
        int numAssi = (obj.numAssi>5)?5:obj.numAssi;
        return (obj instanceof VeicoloLeggero)?'A':((numAssi==2)?'B':(char)(numAssi+'0'));
    }

    public String getModello() { return modello; }
    public String getMarca() { return marca; }
    public String getAnno() { return anno; }
    public String getTarga() { return targa; }
    public int getPeso() { return peso; }
    public int getAltezza() { return altezza; }

}

interface Pesante {

}