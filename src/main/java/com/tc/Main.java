package com.tc;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        Gson gson = new Gson();
        String json = ArquivosIO.lerConteudoArquivo("exemplo.json");

        Transicao t = gson.fromJson(json, Transicao.class);

        t.printTransicao();
    }
}