class Valor{

    private int valor;
    private int[] par = new int[5];
    private int[] impar = new int[5];
    private int contPar = 0;
    private int contImpar = 0;

    public void setValor(int valor){
        this.valor = valor;
    }

    public void posicao(){
        if (valor % 2 == 0) {
            par[contPar] = valor; 
            contPar++;
        } else {
            impar[contImpar] = valor;
            contImpar++;
        }

        if (contPar == 5) {
            contPar = 0;
            for (int j = 0; j < par.length; j++) {
                System.out.println("par[" + j + "] = " + par[j]);
            }
        } else if (contImpar == 5) {
            contImpar = 0;
            for (int j = 0; j < impar.length; j++) {
                System.out.println("impar[" + j + "] = " + impar[j]);
            }
        }

        for (int i = 0; i < contImpar; i++) {
            System.out.println("impar[" + i + "] = " + impar[i]);
        }
        for (int i = 0; i < contPar; i++) {
            System.out.println("par[" + i + "] = " + par[i]);
        }
    }
}