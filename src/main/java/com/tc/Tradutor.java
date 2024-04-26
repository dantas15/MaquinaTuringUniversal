package com.tc;

public class Tradutor{
    public Tradutor(){
    }
    
    public String en(String valor){//encode
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
}
