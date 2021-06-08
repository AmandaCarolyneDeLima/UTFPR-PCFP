import java.util.Scanner;

class InterfaceTexto {
    private Scanner entrada;
    private Valor valor;

    public InterfaceTexto() {
        entrada = new Scanner(System.in);
        valor = new Valor(2, 2);
    }

    public void executar() {

        valor.setO(entrada.next().charAt(0));

        for (int i = 0; i < valor.getColuna(); i++) {
        	for (int j = 0; j < valor.getLinha(); j++) {
        		//m[i][j] = entrada.nextDouble();
        		valor.setM(entrada.nextDouble(), j, i);
        	}
        }

        valor.posicao();
    }
}