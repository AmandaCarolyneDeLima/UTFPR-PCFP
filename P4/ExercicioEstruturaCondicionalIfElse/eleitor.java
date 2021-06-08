//Modele uma classe que represente um eleitor. Implemente um método que retorne se o voto é//
//obrigatório para a idade informada.//

public class eleitor {
    
    private int idade;
    
    public eleitor(int idade) {
        setIdade(idade);
    }
    
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public int getIdade() {
        return idade;
    }
    
    public String getSituacaoVoto() {
        
        if ((this.idade >= 18) && (this.idade < 60))
            return ("Voto Obrigatório");
            
            else
                if ((this.idade >= 16) || (this.idade >=60))
                    return ("Voto não obrigatório");
                    
        return ("Sem direito ao voto");            
    }
}