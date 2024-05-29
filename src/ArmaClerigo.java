/**
 * Classe abstrata que representa uma Arma de Clérigo.
 */
public abstract class ArmaClerigo extends Arma {
    /**
     * Método construtor da classe ArmaClerigo.
     * 
     * @param nome    nome da arma.
     * @param modDano modificador de dano da arma.
     */
    public ArmaClerigo(String nome, double modDano) {
        super(nome, modDano);
    }
}
