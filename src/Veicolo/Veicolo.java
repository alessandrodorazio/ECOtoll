package veicolo;

public class Veicolo {

    public String modello, marca, targa, classeAmbientale;
    public int assi, anno, peso, altezza; //peso in kg, altezza in cm

    public Veicolo(String modello, String marca, int anno, String targa, String classeAmbientale, int assi, int peso, int altezza)
    {
        this.modello = modello;
        this.marca = marca;
        this.targa = targa;
        this.classeAmbientale = classeAmbientale;
        this.anno = anno;
        this.assi = assi;
        this.peso = peso;
        this.altezza = altezza;
    }

    public static Veicolo nuovoVeicolo(String modello, String marca, int anno, String targa, String classeAmbientale, int assi, int peso, int altezza) {
        if(assi == 2 && altezza <= 130) //veicolo leggero o pesante?
            return new VeicoloLeggero(modello,marca,anno,targa,classeAmbientale,assi,peso,altezza); //veicolo leggero
        else
            return new VeicoloPesante(modello,marca,anno,targa,classeAmbientale,assi,peso,altezza); //veicolo pesante
    }

    public static char getClasseTariffaria(Veicolo obj)
    {
        int assi = (obj.assi>5)?5:obj.assi;
        return (obj instanceof VeicoloLeggero)?'A':((assi==2)?'B':(char)(assi+'0'));
    }

    public static int getClasseTariffariaInt(Veicolo obj)
    {
        int assi = (obj.assi>5)?5:obj.assi;
        return (obj instanceof VeicoloLeggero)?1:assi;
    }

    @Override
    public String toString()
    {
        return "Modello: '" + modello + '\'' +
                ", Marca: '" + marca + '\'' +
                ", Targa:'" + targa + '\'' +
                ", Classe ambientale: '" + classeAmbientale + '\'' +
                ", Assi: " + assi +
                ", Anno: " + anno +
                ", Peso: " + peso +
                ", Altezza: " + altezza +
                '}';
    }

}

interface InterfacciaVeicolo {
    char getClasseTariffaria();
    int getClasseTariffariaInt();
}
