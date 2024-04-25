package com.tc;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ArquivosIO {
  public static String lerConteudoArquivo(String nomeArquivo) {
    String conteudoNaoFormatado = "";

    System.out.println(Paths.get("").toAbsolutePath().toString());

    try {
      conteudoNaoFormatado = Files.readString(Paths.get(nomeArquivo));
    } catch (IOException e) {
      e.printStackTrace();
    }

    return conteudoNaoFormatado;
  }
}
