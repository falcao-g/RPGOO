import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Arma arma;
        Personagem[] personagens = new Personagem[2];

        for (int i = 0; i < 2; i++) {
            int pTipo = scanner.nextInt();
            double pVida = scanner.nextDouble();
            double pForca = scanner.nextDouble();
            double pDestreza = scanner.nextDouble();
            int pArma = scanner.nextInt();

            if (pTipo == 1) {
                if (pArma == 1) {
                    arma = new Transmutacao();
                } else {
                    arma = new Psikappa();
                }

                personagens[i] = new Mago(pVida, pForca, pDestreza, arma);
            } else if (pTipo == 2) {
                if (pArma == 1) {
                    arma = new Espada();
                } else {
                    arma = new Lanca();
                }

                personagens[i] = new Paladino(pVida, pForca, pDestreza, arma);
            } else {
                if (pArma == 1) {
                    arma = new Martelo();
                } else {
                    arma = new Maca();
                }

                personagens[i] = new Clerigo(pVida, pForca, pDestreza, arma);
            }
        }

        while (true) {
            int atacante = scanner.nextInt();

            if (atacante == 0) {
                break;
            }

            int defensor = scanner.nextInt();

            personagens[atacante - 1].atacar(personagens[defensor - 1]);
            personagens[0].printStatus();
            personagens[1].printStatus();
        }
        scanner.close();
    }
}
