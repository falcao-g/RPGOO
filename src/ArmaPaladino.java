/**
 * Classe abstrata que representa uma Arma de Paladino.
 */
public abstract class ArmaPaladino extends Arma {
    /**
     * Método construtor da classe ArmaPaladino.
     * 
     * @param nome    nome da arma.
     * @param modDano modificador de dano da arma.
     */
    public ArmaPaladino(String nome, double modDano) {
        super(nome, modDano);
    }
}
