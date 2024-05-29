import java.math.BigDecimal;

public abstract class Personagem {
    private String nomeTipo;
    private double saude;
    private double forca;
    private double destreza;
    private Arma arma;

    public Personagem(String nomeTipo, double saude, double forca, double destreza, Arma arma) {
        this.nomeTipo = nomeTipo;
        this.saude = saude;
        this.forca = forca;
        this.destreza = destreza;
        this.arma = arma;
    }

    public void printStatus() {
        if (!this.estaMorto()) {
            System.out.printf(this.nomeTipo + " [Saude: %.1f, Forca: %.1f, Destreza: %.1f, %s]\n", this.saude,
                    this.forca,
                    this.destreza, this.arma.getNome());
            return;
        }
        System.out.printf(this.nomeTipo + " [Morreu, Forca: %.1f, Destreza: %.1f, %s]\n", this.forca,
                this.destreza, this.arma.getNome());
    }

    public void atacar(Personagem alvo) {
        if (this.estaMorto()) {
            System.out.println("O " + this.nomeTipo + " não consegue atacar, pois está morto.");
            return;
        }
        System.out.println("O " + this.nomeTipo + " ataca o " + alvo.nomeTipo + " com " + this.arma.getNome() + ".");

        if (alvo.estaMorto()) {
            System.out.println("Pare! O " + alvo.nomeTipo + " já está morto!");
            return;
        }

        if (this.forca > alvo.forca && this.destreza > alvo.destreza) {
            double dano = this.calculaDano();
            System.out.printf("O ataque foi efetivo com %.1f pontos de dano!\n", dano);
            alvo.recebeDano(dano);
        } else if (this.forca < alvo.forca || this.destreza < alvo.destreza) {
            double dano = alvo.calculaDano();
            System.out.printf("O ataque foi inefetivo e revidado com %.1f pontos de dano!\n", dano);
            this.recebeDano(dano);
        } else {
            System.out.println("O ataque foi defendido, ninguém se machucou!");
        }

    }

    private double calculaDano() {
        BigDecimal dano = new BigDecimal(this.arma.getModDano() * this.forca);
        return dano.setScale(1, BigDecimal.ROUND_HALF_UP).doubleValue();
    }

    private double recebeDano(double dano) {
        this.saude -= dano;
        return this.saude;
    }

    private boolean estaMorto() {
        return this.saude <= 1;
    }
}
