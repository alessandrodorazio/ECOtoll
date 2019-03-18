package pedaggio;

import autostrada.*;
import veicolo.*;

class Pedaggio {

    public int calcoloPedaggio(Casello caselloEntrata, Casello caselloUscita, Veicolo veicolo) {
        int kmPercorsi = caselloUscita.getKm() - caselloEntrata.getKm();
        return kmPercorsi;
    }

}