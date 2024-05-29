/**
 * Classe abstrata que representa uma arma.
 */
public abstract class Arma {
    private String nome;
    private double modDano;

    /**
     * Método construtor da classe Arma.
     * 
     * Toda arma possui um nome e um modificador de dano que
     * será usado para calcular o dano causado por um personagem.
     * 
     * @param nome    Nome da arma.
     * @param modDano Modificador de dano da arma.
     */
    public Arma(String nome, double modDano) {
        this.nome = nome;
        this.modDano = modDano;
    }

    /**
     * Método getter para o nome da arma.
     * 
     * @return nome da arma.
     */
    public String getNome() {
        return this.nome;
    }

    /**
     * Método getter para o modificador de dano da arma.
     * 
     * @return modificador de dano da arma.
     */
    public double getModDano() {
        return this.modDano;
    }
}
