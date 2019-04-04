package autostrada;

import veicolo.*;
import casello.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Autostrada {

    private String denominazione;
    public LinkedList<Casello> caselli;
    private boolean tipologia; //true = pianura, false = montagna

    private float[] tariffaUnitaria; //A-B-3-4-5

    public Autostrada(String denominazione, LinkedList<Casello> caselli, boolean tipologia, float[] tariffaUnitaria) {
        this.denominazione = denominazione;
        this.caselli = caselli;
        this.tipologia = tipologia;
        if(tariffaUnitaria.length != 5) throw new Error("Il vettore delle tariffe unitarie deve contenere esattamente cinque elementi");
        this.tariffaUnitaria = tariffaUnitaria;
    }

    public String getDenominazione() { return denominazione; }
    public LinkedList<Casello> getCaselli() { return caselli; }
    public boolean isTipologia() { return tipologia; }
    public float[] getTariffaUnitaria() { return tariffaUnitaria; }

    public void nuovoCasello(String nome, int km){ caselli.add(new Casello(nome, km)); } //istanziamo un nuovo casello e aggiungiamolo alla linkedlist caselli
    public float getTariffaUnitaria(Veicolo veicolo) { return tariffaUnitaria[Veicolo.getClasseTariffariaInt(veicolo) - 1] ; }

    @Override
    public String toString() {
        return "Autostrada{" +
                "denominazione='" + denominazione + '\'' +
                ", caselli=" + caselli +
                ", tipologia=" + tipologia +
                ", tariffaUnitaria=" + Arrays.toString(tariffaUnitaria) +
                '}';
    }
}
