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

        for (int i=0; i < 100; i++) {
            valor.setA(entrada.nextDouble(), i);
        }

        System.out.println(valor.posicao());
    }
}

class Valor{
    
    private double valor;
    private double a[] = new double[100];

    public void setValor(int valor){
        this.valor = valor;
    }

    public void setA(double a, int posic){
        this.a[posic] = a;
    }

    public String posicao(){
        for (int i=0; i < a.length; i++) {
            if (a[i] <= 10) {
                System.out.println(String.format("A["+ i +"] = %.1f" , a[i]));
            }
        }
        return "";
    }
}
