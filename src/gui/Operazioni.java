package gui;

import controller.UserController;
import utente.Utente;

import javax.swing.*;

public class Operazioni {

    public static void operazioni(Utente utente) {

        JFrame frame = new JFrame("Operazioni");
        JLabel nome = new JLabel("Ciao, " + utente.nome);
        nome.setBounds(30, 10, 680, 50);
        frame.add(nome);

        JButton aggiungiVeicolo = UserController.aggiungiVeicoloBtn(utente);
        aggiungiVeicolo.setBounds(0, 70, 340, 50);
        frame.add(aggiungiVeicolo);

        JButton calcolaPedaggio = UserController.calcoloPedaggioBtn(utente);
        calcolaPedaggio.setBounds(360, 70, 340, 50);
        frame.add(calcolaPedaggio);

        JButton aggiungiCasello = UserController.aggiungCaselloBtn(utente);
        aggiungiCasello.setBounds(0, 190, 340, 50);
        frame.add(aggiungiCasello);



        frame.setSize(700,900);
        frame.setLayout(null);
        frame.setVisible(true);
        System.out.println(utente.nome);
    }

}
