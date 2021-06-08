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
        valor = new Valor();
    }

    public void executar() {

        Scanner entrada = new Scanner(System.in);

        for (int i=0; i < 20; i++) {
            valor.setA(entrada.nextInt(), i);
        }

        System.out.println(valor.posicao());
    }
}

class Valor{

    private int n[] = new int[20];

    private double valor;
    private int aux;

    public void setValor(int valor){
        this.valor = valor;
    }

    public void setA(int n, int posic){
        this.n[posic] = n;
    }

    public String posicao(){

        for (int i=0; i < (n.length / 2); i++) {
            aux = n[i];
            n[i] = n[n.length - 1- i];
            n[n.length - 1 -i] = aux;
        }
        
        for (int i=0; i < n.length; i++) {
            System.out.println("N["+ i +"] = " + n[i]);
        }
        return "";
    }
}