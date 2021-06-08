public class extrafuncionario{
    
    private float totalVendas;
    
    public extrafuncionario(){
        this.totalVendas = 0.0f;
    }
    
    public void setTotalVendas(float totalVendas){
        this.totalVendas=totalVendas;
    }
    
    public float getTotalVendas(){
        return this.totalVendas;
    }
    
    public float getBonificacao(){
        float bonus=0.0f;
        
        if(totalVendas<1000)
            bonus=0.0f;
            else
            if(totalVendas<2000)
                bonus=0.1f;
                else
                if(totalVendas<3000)
                    bonus=0.15f;
                    else
                    if(totalVendas<4000)
                        bonus=0.2f;
                        else
                        bonus=0.25f;
                        
        return this.totalVendas + (totalVendas*bonus);
    }
}