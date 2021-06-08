//Exercicio 4

//Considere um relógio que marca horas e minutos. Coube-lhe a tarefa de fornecer informações para
//uma interface gráfica de um relógio analógico. Disponha de métodos que retornem a posição de
//cada ponteiro do relógio, em graus. Considere doze horas como a posição inicial, ou seja, 0º. Não
//julgue a resolução como correta sem comparar o resultado com um relógio real.

import java.lang.Math;

public class relogio{
    private int horas,minutos;
    
    public relogio (int horas,int minutos){
        this.horas = horas;
        this.minutos = minutos;
    }
    
    public int getHoras (){
        return this.horas;
    }
    
    public void setHoras (int horas){
        this.horas = horas;
    }
    
    public int getMinutos (){
        return this.minutos;
    }
}