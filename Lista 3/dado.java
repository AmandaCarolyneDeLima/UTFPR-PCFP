//Exercicio 5

//Modele e implemente a rolagem de um dado com n faces. O número de faces deve ser informado na
//criação do objeto e não pode ser alterado. Ofereça métodos para rolar o dado e para observar o
//número da última rolagem. Para isso, pesquise como fazer a geração de números aleatórios na
//linguagem.

import java.util.Random;

public class dado {
    private int face,faceA,faceB,anterior;
    
    public dado (){
        this.face = face;
        this.faceA = faceA;
        this.faceB = faceB;
        this.anterior = anterior;
    }
    
    public int getFace (){
        return this.face;
    }
    
    public void setFace (int face) {
        this.face = face;
    }
    
    public int getFaceA (){
        return this.faceA;
    }
    
    public void setFaceA (int faceA) {
        this.faceA = faceA;
    }
    
    public int getFaceB (){
        return this.faceB;
    }
    
    public void setFaceB (int faceB) {
        this.faceB = faceB;
    }
    
    public int getAnterior (){
        return this.anterior;
    }
    
    public void setAnterior (int anterior){
        this.anterior = anterior;
    }
}