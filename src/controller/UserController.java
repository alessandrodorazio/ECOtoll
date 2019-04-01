package controller;

import utente.Utente;

import javax.swing.*;

public class UserController {

    public static JButton soloAdmin(Utente utente, String testo) {
        return new JButton((utente.admin)?testo:"Operazione non consentita");
    }

    public static JButton aggiungiVeicoloBtn(Utente utente){
        JButton pulsante = new JButton("Aggiungi veicolo");
        return pulsante;
    }

    public static JButton calcoloPedaggioBtn(Utente utente){
        JButton pulsante = new JButton("Calcola pedaggio");
        return pulsante;
    }

    public static JButton aggiungCaselloBtn(Utente utente){ return soloAdmin(utente, "Aggiungi casello"); }

}
