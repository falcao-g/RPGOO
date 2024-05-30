/**
 * Classe que representa um personagem da classe Paladino.
 */
public class Paladino extends Personagem {
    /**
     * Método construtor da classe Paladino.
     * 
     * @param saude        pontos de vida do Paladino.
     * @param forca        força do Paladino.
     * @param destreza     destreza do Paladino.
     * @param ArmaPaladino arma do Paladino.
     */
    public Paladino(double saude, double forca, double destreza, ArmaPaladino arma) {
        super("Paladino", saude, forca, destreza, arma);
    }
}
