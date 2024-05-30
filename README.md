<h1 align='center'> Trabalho Prático LPOO </h1>

<p align='center'>
    <img alt="Top language" src="https://img.shields.io/github/languages/top/falcao-g/LPOO">
    <img alt="UFMS" src="https://img.shields.io/badge/UFMS--blue.svg">
</p>

<p align="center">
    <b>Renan Albuquerque Marks | Linguagem de Programação Orientada a Objetos</b>
</p>

## 📚 Descrição

O objetivo deste trabalho é implementar em linguagem de programação Java um sistema de combates de um jogo de RPG. Cada personagem possui uma classe (Mago, Paladino e Clérigo), pontos de vida, força, destreza e pode escolher entre duas armas. Cada arma possui um modificador de dano.

O sistema deve permitir que dois personagens se ataquem, caso o atacante tenha força e destreza maiores que o inimigo, o ataque é bem sucedido e o inimigo perde pontos de vida (calculados usando a força do atacante e o modificador de dano da arma). Se a força ou destreza do atacante for menor que a do inimigo, o ataque é mal sucedido e revidado. Caso contrário, o ataque é defendido e ninguém perde vida.

O esquema de classes inclui classes abstratas, concretas, herança e deve ser implementado de acordo com o seguinte diagrama UML:

## 🚀 Funcionalidades

Inicialmente são disponíveis 3 classes e 2 armas para cada classe, o Mago pode escolher entre a Psi-kappa e a Magia da Transmutação, o Paladino pode usar ou a Espada ou a Lança e o Clérigo tem o Martelo e a Maça como opções.

O programa deve receber como entrada as informações necessárias para criar dois personagens com seus pontos de saúde, força, destreza e arma carregada.

Por exemplo, para criar dois personagens:

- Clérigo com 10 pontos de saúde, 6 de força, 4 de destreza com Martelo;
- Mago com 10 pontos de saúde, 5 de força, 6 de destreza com Magia da Transmutação;

Teríamos como entrada:

```
3 10 6 4 1
1 10 5 6 1
```

E seria impresso:

```
Clérigo [Saude: 10.0, Forca: 6.0, Destreza: 4.0, Martelo]
Mago [Saude: 10.0, Forca: 5.0, Destreza: 6.0, Magia da Transmutação]
```

A seguir, o programa esperaria como entrada a sequencia de ataques. A sequencia de ataques deve ser informada com dois números: o primeiro número do personagem atacante e o segundo
número do personagem defensor. Por exemplo, para informar o ataque do Clérigo contra o Mago, a entrada seria:

```
1 2
```

E seria impresso:

```
O Clérigo ataca o Mago com Martelo.
O ataque foi inefetivo e revidado com 1.3 pontos de dano!
Clérigo [Saude: 8.7, Forca: 6.0, Destreza: 4.0, Martelo]
Mago [Saude: 10.0, Forca: 5.0, Destreza: 6.0, Magia da transmutação]
```

Para informar o fim da batalha, a entrada deve ser informada com o número zero:

```
0
```
