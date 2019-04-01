package utente;
import veicolo.*;

public class Utente {
    public String nome;
    public Veicolo veicolo;
    public boolean admin = false;

    public Utente(String nome, boolean admin) {
        this.nome = nome;
        this.admin = admin;
    }

    public Utente(String nome, Veicolo veicolo, boolean admin) {
        this.nome = nome;
        this.veicolo = veicolo;
        this.admin = admin;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public Veicolo getVeicolo() { return veicolo; }
    public void setVeicolo(Veicolo veicolo) { this.veicolo = veicolo; }
}
