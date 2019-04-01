package pedaggio;

import autostrada.*;
import veicolo.*;
import casello.*;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Pedaggio {

    private static final float IVA = 1.22f; //IVA al 22%

    public static String pedaggioMsg(Casello caselloEntrata, Casello caselloUscita, Autostrada autostrada, Veicolo veicolo){
        float pedaggio = calcoloPedaggio(caselloEntrata, caselloUscita, autostrada, veicolo);
        return "Il pedaggio da " + caselloEntrata.getNome() + " a " + caselloUscita.getNome() + " per il veicolo " + veicolo.marca + " " + veicolo.modello + " targato " + veicolo.targa + " è di " + pedaggio + " euro";
    }

    public static float calcoloPedaggio(Casello caselloEntrata, Casello caselloUscita, Autostrada autostrada, Veicolo veicolo)
    {
        float kmPercorsi = caselloUscita.getKm() - caselloEntrata.getKm();
        if(kmPercorsi == 0) throw new Error("I due caselli coincidono"); //errore: i caselli coincidono
        if(kmPercorsi < 0) kmPercorsi*=-1; //nel caso in cui la direzione sia opposta
        float pedaggio = kmPercorsi * autostrada.getTariffaUnitaria(veicolo) * IVA;
        return Helper.arrotondamento(pedaggio);
    }

}

class Helper {

    public static float arrotondamento(float value)
    {
        //arrotondamento ai 10 centesimi di euro
        BigDecimal bd = new BigDecimal(value).setScale(1, RoundingMode.HALF_UP );
        return bd.floatValue();
    }

}