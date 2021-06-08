import java.util.Scanner;

class InterfaceTexto {
    private Scanner entrada;
    private Valor valor;

    public InterfaceTexto() {
        entrada = new Scanner(System.in);
        valor = new Valor();
    }

    public void executar() {

        valor.setO(entrada.next().charAt(0));

        valor.setDefinir(entrada.next());
        valor.setValor(entrada.nextDouble());
        valor.posicao();
    }
}