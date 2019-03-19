package pedaggio;

import autostrada.*;
import veicolo.*;
import casello.*;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Pedaggio {
    private static final boolean normativa2021 = false;
    private static final float imposte = 4f;
    private static final float IVA = 1.22f; //IVA al 22%

    public static float calcoloPedaggio(Casello caselloEntrata, Casello caselloUscita, Autostrada autostrada, Veicolo veicolo) {
        float kmPercorsi = caselloUscita.getKm() - caselloEntrata.getKm();
        if(kmPercorsi == 0) throw new Error("I due caselli coincidono");
        if(kmPercorsi < 0) kmPercorsi*=-1;
        float pedaggio = kmPercorsi * autostrada.getTariffaUnitaria(veicolo)*IVA;
        pedaggio += (maggiorazioni() + imposte); //le maggiorazioni e le imposte vengono aggiunte al pedaggio finale
        return Helper.arrotondamento(pedaggio);
        //considerare pedaggio extra solamente quando la normativa entrerà in vigore
    }

    public static float maggiorazioni() { //inserire l'algoritmo della normativa vigente
        return 3.2f;
    }

}

class Helper {
    public static float arrotondamento(float value){
        //arrotondamento a una cifra decimale
        BigDecimal bd = new BigDecimal(value).setScale(1, RoundingMode.HALF_UP );
        return bd.floatValue();
    }
}