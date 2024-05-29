/**
 * Classe que representa um personagem da classe Clérigo.
 */
public class Clerigo extends Personagem {
    /**
     * Método construtor da classe Clerigo.
     * 
     * @param saude    pontos de vida do Clérigo.
     * @param forca    força do Clérigo.
     * @param destreza destreza do Clérigo.
     * @param arma     arma do Clérigo.
     */
    public Clerigo(double saude, double forca, double destreza, Arma arma) {
        super("Clérigo", saude, forca, destreza, arma);
    }
}
