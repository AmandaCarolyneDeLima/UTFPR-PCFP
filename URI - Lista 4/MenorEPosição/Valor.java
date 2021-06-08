class Valor{

    int[] x;
    int menor = 0;
    int posMenor = 0;

    public void setTamanho(int tamanho){
        this.x = new int[tamanho];
    }

    public void setX(int x, int posicao){
        this.x[posicao] = x;
    }

    public String posicao(){
        for (int i = 0; i < x.length; i++) {
            if (i == 0) {
                menor = x[i];
                posMenor = i;
            } else if (x[i] < menor) {
                menor = x[i];
                posMenor = i;
            }
        }
        return "Menor valor: " +menor + "\n" +"Posicao: " + posMenor;
    }
}
