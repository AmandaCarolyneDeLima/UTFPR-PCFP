import java.util.Scanner;

class InterfaceTexto {
    private Scanner entrada;
    private Valor valor;

    public InterfaceTexto() {
        entrada = new Scanner(System.in);
        valor = new Valor();
    }

    public void executar() {
        
        int verificador = entrada.nextInt();
        
        
        
        while (verificador != 0) {
            
            int atualizador = entrada.nextInt();
            
            valor.setValor(atualizador);
            verificador = atualizador;
        }

        //valor.setValor(entrada.nextInt());

        System.out.println(valor.getPosicao());

        //salario.setHorasTrabalhadas(entrada.nextInt());
        //salario.setValorDaHora(entrada.nextFloat());

        //sln("NUMBER = " + salario.getNumero());
        //sln("SALARY = U$ " + formateParaDuasCasasDecimais(salario.getValorAReceber()));
    }

    private String formateParaDuasCasasDecimais(float valor) {
        return String.format("%.2f", valor);
    }

    private void sln() {
        System.out.println();
    }

    private void sln(String s) {
        System.out.println(s);
    }
}