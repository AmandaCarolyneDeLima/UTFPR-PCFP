//Exercicio 6

//Modele computacionalmente o problema de calcular a densidade populacional de uma cidade.
//Abstraia atributos e métodos para essa modelagem e implemente-a.

import java.util.Scanner;

public class densidadePop{
    private int populacao;
    private double area;
    
    public densidadePop(){
        this.populacao = populacao;
        this.area = area;
    }
    
    public int getPopulacao (){
        return this.populacao;
    }
    
    public void setPopulacao (int populacao){
        this.populacao = populacao;
    }
    
    public double getArea (){
        return this.area;
    }
    
    public void setArea (double area){
        this.area = area;
    }
    
    public double getDensidade (){
        return (this.populacao / this.area);
    }
}