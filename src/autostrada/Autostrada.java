package autostrada;

import veicolo.*;
import casello.*;

import java.util.Arrays;
import java.util.Map;

public class Autostrada {

    private String denominazione;
    private Map caselli;
    private boolean inPianura; //se in montagna settare a false
    private float variazioneInPianura;
    private float variazioneInMontagna;

    private float[] tariffaUnitaria = {1.22f, 1.33f, 1.32f, 1.55f, 1.35f}; //A-B-3-4-5

    private final boolean[] oneriCostiEsterniAttivi = {false, false, false, false, false, false};
    private final float[] oneriCostiEsterni = {0f, 0f, 0f, 0f, 0f, 0f}; //Euro 1-6

    public Autostrada(String denominazione, Map caselli, boolean inPianura, float variazioneInPianura, float variazioneInMontagna, float[] tariffaUnitaria) {
        this.denominazione = denominazione;
        this.caselli = caselli;
        this.inPianura = inPianura;
        this.variazioneInPianura = variazioneInPianura;
        this.variazioneInMontagna = variazioneInMontagna;
        this.tariffaUnitaria = tariffaUnitaria;
    }

    public float getTariffaUnitaria(Veicolo veicolo) {
        float variazione = inPianura?variazioneInPianura:variazioneInMontagna; //la tipologia dell'autostrada modifica la costante moltiplicativa tariffaria
        float tariffa = tariffaUnitaria[veicolo.getClasseTariffariaInt() - 1] + getOneriCostiEsterni(veicolo) + variazione;
        return tariffa;
    }

    public float getOneriCostiEsterni(Veicolo veicolo) {
        String classeAmbientale = veicolo.classeAmbientale;
        if( oneriCostiEsterniAttivi[ veicolo.getClasseAmbientaleInt() - 1]) { //i costi esterni sono attivi
            return oneriCostiEsterni[veicolo.getClasseAmbientaleInt() - 1];
        }
        return 0f;
    }

    public void aggiungiCasello(int km, String nomeCasello) {
        caselli.put(km, nomeCasello);
    }

    protected void setTariffaUnitariaSingola(float nuovaTariffa, int classeTariffaria) {
        this.tariffaUnitaria[classeTariffaria-1] = nuovaTariffa;
    }

    @Override
    public String toString() {
        return "Autostrada{" +
                "denominazione='" + denominazione + '\'' +
                ", caselli=" + caselli +
                ", inPianura=" + inPianura +
                ", variazioneInPianura=" + variazioneInPianura +
                ", variazioneInMontagna=" + variazioneInMontagna +
                ", tariffaUnitaria=" + Arrays.toString(tariffaUnitaria) +
                ", oneriCostiEsterniAttivi=" + Arrays.toString(oneriCostiEsterniAttivi) +
                ", oneriCostiEsterni=" + Arrays.toString(oneriCostiEsterni) +
                '}';
    }
}
