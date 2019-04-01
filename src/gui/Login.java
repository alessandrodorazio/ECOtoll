package gui;

import controller.UserController;
import utente.*;
import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Login {

    public static void init() {
        Utente utente;

        JFrame frame = new JFrame("Login");

        JLabel testo = new JLabel("Che tipo di utente sei?");
        testo.setBounds(50,20,300, 40);

        JTextField input = new JTextField();
        input.setBounds(50, 50, 300, 40);



        JButton user = new JButton("Entra");
        user.setBounds(50,130,300, 40);
        user.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                frame.setVisible(false);
                Login.auth(input.getText());
            }
        });

        frame.add(testo);
        frame.add(input);
        frame.add(user);

        frame.setSize(400,200);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    public static void auth(String text){
        boolean admin = (text=="admin");
        Utente utente = new Utente(text, admin);
        Operazioni.operazioni(utente);
    }

}
