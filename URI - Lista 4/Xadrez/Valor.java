class Valor{

    private double valorL;
    private double valorC;

    public void setValorL(int valorL){
        this.valorL = valorL;
    }

    public void setValorC(int valorC){
        this.valorC = valorC;
    }

    public int xadrez(){
        
        if (valorL % 2 == valorC % 2) 
        	return 1;
        else
        	return 0;
    }	
}
