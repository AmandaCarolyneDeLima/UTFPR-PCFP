class Valor{

    private int valor;
    private int x;
    private int t;
    private int y;

    public void setValor(int valor){
        this.valor = valor;
    }

    public int matriz(){
        while (valor != 0) {
            int[][] M = new int[valor][valor];
            x = 1;
            for (int i = 1; i <= valor; i++) {
                y = x;
                for (int j = 1; j <= valor; j++) {
                    M[i-1][j-1] = y;
                    y *= 2;
                }
                x *= 2;
            }

            t = String.valueOf(M[valor-1][valor-1]).length();
            for (int i = 1; i <= valor; i++) {
                for (int j = 1; j <= valor; j++) {

                    System.out.printf("%"+ t +"d", M[i-1][j-1]);
                    if (j < valor) System.out.print(" ");
                    else System.out.print("\n");
                }
            }

            System.out.print("\n");
            //valor = entrada.nextInt();
        }
        return 0;
    }
}