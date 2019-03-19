import autostrada.*;
import veicolo.*;
import pedaggio.*;
import casello.*;

public class Program {


    public static void main(String[] args){
        /* Esempio veicoli, realizzati mediante array, ottimizzazione futura tramite connessione via database */
        Veicolo[] veicoli = new Veicolo[3];
        veicoli[0] = Veicolo.nuovoVeicolo("Smart", "ForTwo", 2014, "SM444RT", "Euro 4", 2, 3, 125); //leggero
        veicoli[1] = Veicolo.nuovoVeicolo("Scania", "AutoArticolato", 2016, "SC333IA", "Euro 5", 4, 3200, 200); //pesante
        veicoli[2] = Veicolo.nuovoVeicolo("Opel", "Astra", 2009, "AS777RA", "Euro 3", 2, 3, 140); //pesante

        System.out.println("Veicoli");
        System.out.println(veicoli[0]);
        System.out.println(veicoli[1]);
        System.out.println(veicoli[2]);
        System.out.println("\n");

        /* Esempio caselli e autostrada */
        Casello[] caselli = new Casello[3];
        caselli[0] = new Casello("AQ Ovest", 300);
        caselli[1] = new Casello("AQ Est", 305);
        caselli[2] = new Casello("Assergi", 310);
        System.out.println("Caselli");
        System.out.println(caselli[0].toString());
        System.out.println(caselli[1].toString());
        System.out.println(caselli[2].toString());
        System.out.println("\n");

        float[] tariffaUnitaria = {2f, 2.3f, 2.6f, 2.9f, 3.2f};
        Autostrada a14 = new Autostrada("Autostrada A14", caselli, true, 0f, 0f, tariffaUnitaria);
        System.out.println("Autostrade");
        System.out.println(a14.toString()); //informazioni sull'autostrada
        System.out.println("\n");

        /* Esempio pedaggio */
        System.out.println("Pedaggi");
        System.out.println("Pedaggio per il veicolo " + veicoli[0].targa + " per il tratto " + caselli[0].getName() + " - " + caselli[1].getName() + " è di " + Pedaggio.calcoloPedaggio(caselli[0], caselli[2], a14, veicoli[0]) + "€");
        System.out.println("Pedaggio per il veicolo " + veicoli[1].targa + " per il tratto " + caselli[1].getName() + " - " + caselli[2].getName() + " è di " + Pedaggio.calcoloPedaggio(caselli[1], caselli[2], a14, veicoli[1]) + "€");

    }

}
