import java.util.*;
import autostrada.*;
import controller.LoginController;
import veicolo.*;

public class Program{

    public static final String nomeSoftware = "Autostrada A14";
    public static final float versione = 0.1f;
    public static Autostrada autostrada;

    public static void main(String[] args){

        float[] tariffaUnitaria = {2f, 2.3f, 2.6f, 2.9f, 3.2f};

        autostrada = new Autostrada("Autostrada A14", new TreeMap(), true, 0f, 0f, tariffaUnitaria );

        LoginController.login(); //start gui

        System.out.println("Sei un utente o un amministratore? 1 = utente, 2 = amministratore");

        Scanner in = new Scanner(System.in);
        int tipoUtente = in.nextInt();
        System.out.println(tipoUtente);


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
        Map caselli = new TreeMap();
        caselli.put(300, "AQ Ovest");
        caselli.put(305, "AQ Est");
        caselli.put(310, "Assergi");
        System.out.println("Caselli");
        System.out.println(caselli.size());

        System.out.println(caselli.get(300));
        System.out.println(caselli.get(305));
        System.out.println(caselli.get(310));
        System.out.println("\n");

        System.out.println(caselli.entrySet());

        Autostrada a14 = new Autostrada("Autostrada A14", caselli, true, 0f, 0f, tariffaUnitaria);
        System.out.println("Autostrade");
        System.out.println(a14.toString()); //informazioni sull'autostrada
        System.out.println("\n");

        /* Esempio pedaggio */
        System.out.println("Pedaggi");
        /*
        System.out.println("Pedaggio per il veicolo " + veicoli[0].targa + " per il tratto " + caselli.get(300) + " - " + caselli.get(305) + " è di " + Pedaggio.calcoloPedaggio(caselli.get(0), caselli.get(2), a14, veicoli[0]) + "€");
        System.out.println("Pedaggio per il veicolo " + veicoli[1].targa + " per il tratto " + caselli.get(305) + " - " + caselli.get(310) + " è di " + Pedaggio.calcoloPedaggio(caselli.get(1), caselli.get(2), a14, veicoli[1]) + "€");
        */
    }

}