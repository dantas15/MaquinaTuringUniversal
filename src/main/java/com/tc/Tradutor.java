package com.tc;

public class Tradutor{
    //private arraylist<Estados> estados;
    //private arraylist<Transicoes> transicoes;

    public Tradutor(){

    }
    public String en(String valor){//enconde
        if(valor.equals("B")){
            return "111";
        } else if (valor.equals("0")){
            return "1";
        } else if (valor.equals("1")){
            return "11";
        } else if (valor.equals("L")){
            return "1";
        } else if (valor.equals("R")){
            return "11";
        } else {
            String x = "111";
            int y = Integer.parseInt(valor);
            for(int contador = 2; contador < y; contador++){
                x = x + "1";
            }
            return x;
        }
    }
}
