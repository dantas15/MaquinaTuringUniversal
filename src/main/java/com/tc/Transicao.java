package com.tc;

public class Transicao {
  private String estado;
  private String caractereLeitura;
  private String caractereEscrita;

  enum Direcao {
    L, R
  };

  private Direcao direcao;

  public Transicao(String estado, String caractereLeitura, String caractereEscrita, String direcao)
      throws ExcecaoDirecaoInvalida {
    if (!direcao.equals("L") && !direcao.equals("R")) {
      throw new ExcecaoDirecaoInvalida("Direcao Inválida: " + direcao);
    }

    this.estado = estado;
    this.caractereEscrita = caractereEscrita;
    this.caractereLeitura = caractereLeitura;
    this.direcao = Direcao.valueOf(direcao);
  }

  public void printTransicao() {
    System.out.println("Estado: " + estado);
    System.out.println("Caractere de Leitura: " + caractereLeitura);
    System.out.println("Caractere de Escrita: " + caractereEscrita);
    System.out.println("Direcao: " + direcao);
  }
}
