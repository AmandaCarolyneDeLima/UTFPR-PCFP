class Valor{
    
    private double valor;
    private double a[] = new double[100];

    public void setValor(int valor){
        this.valor = valor;
    }

    public void setA(double a, int posic){
        this.a[posic] = a;
    }

    public String posicao(){
        for (int i=0; i < a.length; i++) {
            if (a[i] <= 10) {
                System.out.println(String.format("A["+ i +"] = %.1f" , a[i]));
            }
        }
        return "";
    }
}
