class Valor{

    private int x;
    private int valor;

    public void setValor(int valor){
        this.valor = valor;
    }

    public int getPosicao(){
        for (int i = 1; i <= valor; i++) {
            for (int j = 1 ; j <= valor; j++) {
                x = i;
                if (j < x) x = j;
                if (valor-i+1 < x) x = valor-i+1;
                if (valor-j+1 < x) x = valor-j+1;

                System.out.printf("%3d", x);
                if (j < valor) System.out.print(" ");
                else System.out.print("\n");
            }
        }
        System.out.print("\n");
        //valor = leitor.nextInt();
        return 0;
    }
}