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

        for (int i=0; i < 4; i++) {
            valor.setA(entrada.nextInt(), i);
        }

        System.out.println(valor.posicao());
    }
}