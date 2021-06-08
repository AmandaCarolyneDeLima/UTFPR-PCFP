import java.util.Scanner;

class InterfaceTexto {
    private Scanner entrada;
    private Valor valor;

    public InterfaceTexto() {
        entrada = new Scanner(System.in);
        valor = new Valor();
    }

    public void executar() {

        Scanner entrada = new Scanner(System.in);
        
        int valorEntrada = entrada.nextInt();
        valor.setTamanho(valorEntrada);

        for (int i = 0; i < valorEntrada; i++) {
            valor.setX(entrada.nextInt() , i);
        }

        System.out.println(valor.posicao());
    }
}