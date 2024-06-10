import java.math.BigDecimal;

/**
 * Classe abstrata que representa um personagem.
 */
public abstract class Personagem {
    private String nomeTipo;
    private double saude;
    private double forca;
    private double destreza;
    private Arma arma;

    /**
     * Método construtor da classe Personagem.
     * 
     * @param nomeTipo nome do tipo do personagem.
     * @param saude    pontos de vida do personagem.
     * @param forca    força do personagem.
     * @param destreza destreza do personagem.
     * @param arma     arma do personagem.
     */
    public Personagem(String nomeTipo, double saude, double forca, double destreza, Arma arma) {
        this.nomeTipo = nomeTipo;
        this.saude = saude;
        this.forca = forca;
        this.destreza = destreza;
        this.arma = arma;

        if (this.saude < 0) {
            this.saude = 0;
        } else if (this.saude > 10) {
            this.saude = 10;
        } else if (this.forca < 0) {
            this.forca = 0;
        } else if (this.forca > 10) {
            this.forca = 10;
        } else if (this.destreza < 0) {
            this.destreza = 0;
        } else if (this.destreza > 10) {
            this.destreza = 10;
        }
    }

    /**
     * Método que imprime o status do personagem, mostrando sua saúde, força,
     * destreza e arma.
     */
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

    /**
     * Método que faz o personagem atacar outro personagem.
     * 
     * A efetividade do ataque é calculada com base na força e destreza do atacante
     * e do defensor. Se o atacante tiver força e destreza maiores que o defensor, o
     * ataque é efetivo e o defensor recebe dano.
     * Se o atacante tiver força e destreza menores que o defensor, o ataque é
     * inefetivo e o atacante recebe dano.
     * Se a força ou destreza forem iguais, o ataque é defendido e ninguém se
     * machuca.
     * 
     * @param alvo personagem que será atacado.
     */
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

    /**
     * Método que calcula o dano do personagem.
     * 
     * O dano é calculado multiplicando o modificador de dano da arma pela força do
     * personagem, arredondando o resultado para uma casa decimal.
     * 
     * @return dano causado pelo personagem.
     */
    private double calculaDano() {
        BigDecimal dano = new BigDecimal(this.arma.getModDano() * this.forca);
        return dano.setScale(1, BigDecimal.ROUND_HALF_UP).doubleValue();
    }

    /**
     * Método que faz o personagem receber dano.
     *
     * @param dano dano recebido pelo personagem.
     * @return saude do personagem após receber o dano.
     */
    private double recebeDano(double dano) {
        this.saude -= dano;
        return this.saude;
    }

    /**
     * Método que verifica se o personagem está morto.
     * 
     * Um personagem está morto se sua saúde for menor a 1.
     * 
     * @return true se o personagem está morto, false caso contrário.
     */
    private boolean estaMorto() {
        return this.saude < 1;
    }
}
