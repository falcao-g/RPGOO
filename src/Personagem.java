public abstract class Personagem {
    private String nomeTipo;
    private double saude;
    private double forca;
    private double destreza;
    // private Arma arma;

    public Personagem(String nomeTipo, double saude, double forca, double destreza /* , Arma arma */) {
        this.nomeTipo = nomeTipo;
        this.saude = saude;
        this.forca = forca;
        this.destreza = destreza;
        // this.arma = arma;
    }

    public void printStatus() {
        // pass
    }

    public void atacar(Personagem alvo) {
        // pass
    }

    private double calculaDano() {
        return 0;
    }

    private double recebeDano(double dano) {
        this.saude -= dano;
        return this.saude;
    }

    private boolean estaMorto() {
        return this.saude <= 0;
    }
}
