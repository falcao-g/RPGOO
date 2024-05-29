/**
 * Classe abstrata que representa uma Arma de Mago.
 */
public abstract class ArmaMago extends Arma {
    /**
     * Método construtor da classe ArmaMago.
     * 
     * @param nome    nome da arma.
     * @param modDano modificador de dano da arma.
     */
    public ArmaMago(String nome, double modDano) {
        super(nome, modDano);
    }
}
