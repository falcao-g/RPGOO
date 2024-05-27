public abstract class Arma {
    private String nome;
    private double modDano;

    public Arma(String nome, double modDano) {
        this.nome = nome;
        this.modDano = modDano;
    }

    public String getNome() {
        return this.nome;
    }

    public double getModDano() {
        return this.modDano;
    }
}
