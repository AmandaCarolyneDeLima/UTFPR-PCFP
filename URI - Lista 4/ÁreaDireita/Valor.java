class Valor{

    private double soma = 0;
    private double[][] M = new double[2][2];
    private double valor;
    private String definir;
    private char O;

    public void setValor(double valor){
        this.valor = valor;
    }

    public double getValor(){
        return valor;
    }

    public void setO(char O){
        this.O = O;
    }

    public void setDefinir(String definir){
        this.definir = definir;
    }

    public String getDefinir(){
        return definir;
    }

    public double posicao(){
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {

                M[i][j] = getValor();
                if (j > i && j > M.length-i-1) soma += M[i][j];
            }
        }

        if (O == 'M') soma /= 30;

        return soma;
    }
}
