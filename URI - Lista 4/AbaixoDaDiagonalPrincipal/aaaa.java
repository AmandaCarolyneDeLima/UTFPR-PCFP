//Amanda Carolyne de Lima
//Isabela Taques Vitek
//Marco Amaral
//DPSI

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		InterfaceTexto i = new InterfaceTexto();
		i.executar();
	}
}

class InterfaceTexto {
    private Scanner entrada;
    private Valor valor;

    public InterfaceTexto() {
        entrada = new Scanner(System.in);
        valor = new Valor(12, 12);
    }

    public void executar() {

        valor.setO(entrada.next().charAt(0));

        for (int i = 0; i < valor.getColuna(); i++) {
        	for (int j = 0; j < valor.getLinha(); j++) {
        		valor.setM(entrada.nextDouble(), j, i);
        	}
        }

        valor.posicao();
    }
}

class Valor{

    private double valor;
    private double soma = 0;
    private double[][] m;
    private int linha;
    private int coluna;
    private char O;
    private double media;

    public Valor (int linha, int coluna){
        this.linha =  linha;
        this.coluna = coluna;
        m = new double [linha][coluna];
    }

    public void setValor(int valor){
        this.valor = valor;
    }

    public void setM(double m, int linha, int coluna){
        this.m[linha][coluna] = m;
    }

    public void setO(char O){
        this.O = O;
    }

    public int getLinha(){
        return linha;
    }

    public int getColuna(){
        return coluna;
    }

    public void posicao(){

        for (int i = 0; i < m.length; i++) {
        	for (int j = 0; j < m[i].length; j++) {
        		if (j < i) soma += m[i][j];
        	}
        }

        if (O == 'm') soma /= ((m.length * m.length) - 12) / 2; // 66
    	System.out.println(String.format("%.1f", soma));
    }
}
