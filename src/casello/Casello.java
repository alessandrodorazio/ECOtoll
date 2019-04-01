package casello;

public class Casello {

    private String nome;
    private int km;

    public Casello(String name, int km)
    {
        this.nome = name;
        this.km = km;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public int getKm() { return km; }
    public void setKm(int km) { this.km = km; }

    @Override
    public String toString()
    {
        return "Casello{" +
                "nome='" + nome + '\'' +
                ", km=" + km +
                '}';
    }
}