/**
 * Classe que representa um personagem da classe Mago.
 */
public class Mago extends Personagem {
    /**
     * Método construtor da classe Mago.
     * 
     * @param saude    pontos de vida do Mago.
     * @param forca    força do Mago.
     * @param destreza destreza do Mago.
     * @param ArmaMago arma do Mago.
     */
    public Mago(double saude, double forca, double destreza, ArmaMago arma) {
        super("Mago", saude, forca, destreza, arma);
    }
}
