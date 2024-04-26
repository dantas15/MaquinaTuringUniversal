package com.tc;

import com.tc.Transicao.Direcao;

public class Tradutor{
    public Tradutor(){
    }

    public String en(String valor){   //encode
        switch(valor){
            case "B":
                return "111";
            case "0":
                return "1";
            case "1":
                return "11";
            case "L":
                return "1";
            case "R":
                return "11";
            default:
                String x = "111";
                int y = Integer.parseInt(valor);
                for(int contador = 2; contador < y; contador++){
                    x = x + "1";
                }
                return x;
        }
    }
    public String parserCompleto(String estado, String leitura, String estadoT, String escrita, Direcao direcao){
        String x = new String();
        if (direcao == Direcao.L){
            x = "L";
        } else if (direcao == Direcao.R){
            x = "R";
        }
        return en(estado.substring(1))+"0"+en(leitura)+"0"+en(estadoT.substring(1))+"0"+en(escrita)+"0"+en(x);
    }
}
