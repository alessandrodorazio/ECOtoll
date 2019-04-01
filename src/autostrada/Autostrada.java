package autostrada;

import veicolo.*;
import casello.*;

import java.util.ArrayList;
import java.util.Arrays;

public class Autostrada {

    private String denominazione;
    public ArrayList<Casello> caselli;
    private boolean tipologia; //true = pianura, false = montagna

    private float[] tariffaUnitaria; //A-B-3-4-5

    public Autostrada(String denominazione, ArrayList<Casello> caselli, boolean tipologia, float[] tariffaUnitaria) {
        this.denominazione = denominazione;
        if(caselli == null)
            this.caselli = new ArrayList<Casello>();
        else
            this.caselli = caselli;
        this.tipologia = tipologia;
        this.tariffaUnitaria = tariffaUnitaria;
    }

    public void nuovoCasello(String nome, int km){ caselli.add(new Casello(nome, km)); }

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
