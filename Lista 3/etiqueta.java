//Exercicio 1

//Modele e implemente um objeto que retorne uma cadeia de caracteres com a etiqueta eletrônica
//de um produto, contendo o valor do quilo, para ser fixada em prateleiras de um supermercado. Essa
//informação é útil a fim de que o consumidor possa comparar preços, quando as embalagens dos
//produtos possuem pesos diferentes. São atributos do produto: descrição, peso em quilos e preço.
//Exemplos de etiquetas geradas:
//- - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
//Barra de Chocolate Diamante Negro
//Peso: 0,090 kg
//Preço: R$ 5,99
//Preço do quilo: R$ 66,56
//- - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
//- - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
//Ovo de Páscoa Diamante Negro
//Peso: 0,176 kg
//Preço: R$ 29,90
//Preço do quilo: R$ 169,89
//- - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
//Lembre-se que a quebra de linha em uma cadeia de caracteres é feita por meio da sequência de
//escape "\n" no texto, assim:
//String texto = "Pula uma linha\n";
//String outroTexto = texto + "Pula mais duas linhas\n\n\";
//Com essa abordagem, de retornar uma cadeia de caracteres ao invés de utilizar uma instrução de
//saída, reforçam-se os princípios da Programação Orientada a Objetos. Dessa forma, ocorre a divisão
//de responsabilidades, onde a classe em questão se concentra apenas em modelar o objeto.

public class etiqueta {
    private String descricao;
    private float peso,preco;
    
    public etiqueta(String descricao, float peso, float preco) {
        this.descricao = descricao;
        this.peso = peso;
        this.preco = preco;
    }
    
    public String getDescricao() {
        return this.descricao;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public float getPeso() {
        return this.peso;
    }
    
    public void setPeso(float peso) {
        this.peso = peso;
    }
    
    public float getPreco() {
        return this.preco;
    }
    
    public void setPreco() {
        this.preco = preco;
    }
    
    public float getPrecoQuilo() {
        return (this.preco/this.peso);
    }
    
    public String etiqueta() {
        return  "---\n" + 
                this.descricao + "\n" + 
                "Peso: " + this.peso + "kg\n" + 
                "Preço:R$ " + this.preco + "\n" +
                "Preço do quilo:R$ " + this.getPrecoQuilo() + "\n" +
                "---\n"; 
    }
}