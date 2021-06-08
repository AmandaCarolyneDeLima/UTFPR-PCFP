import java.util.Scanner;

class InterfaceTexto {
	private Scanner entrada;
	private Valor valor;

	public InterfaceTexto() {
		entrada = new Scanner(System.in);
		valor = new Valor();
	}

	public void executar() {
		valor.setValor(entrada.nextInt());
		
		System.out.println(valor.matriz());
	}
}