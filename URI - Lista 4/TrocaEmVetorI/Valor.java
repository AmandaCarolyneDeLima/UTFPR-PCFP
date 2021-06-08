class Valor{

    private int n[] = new int[4];

    private double valor;
    private int aux;

    public void setValor(int valor){
        this.valor = valor;
    }

    public void setA(int n, int posic){
        this.n[posic] = n;
    }

    public String posicao(){

        for (int i=0; i < (n.length / 2); i++) {
            aux = n[i];
            n[i] = n[n.length - 1- i];
            n[n.length - 1 -i] = aux;
        }
        
        for (int i=0; i < n.length; i++) {
            System.out.println("N["+ i +"] = " + n[i]);
        }
        return "";
    }
}