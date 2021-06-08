import java.util.Scanner;

class InterfaceTexto {
    private Scanner entrada;
    private Valor valor;

    public InterfaceTexto() {
        entrada = new Scanner(System.in);
        valor = new Valor();
    }

    public void executar() {

        for (int i = 0; i < 15; i++) {
            valor.setValor(entrada.nextInt());
        }

        valor.posicao();
    }
}