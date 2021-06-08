//Amanda Carolyne de Lima
//DPSI

import java.util.Random;

public class MatrizDeInteiros{

    private int[][] m;

    public MatrizDeInteiros(int[][] m){
        this.m = m;
    }

    public int escolhido(){

        int numeroMaisProximoMedia;
        int soma = 0;
        double media = 0.0;

        for (int i = 0; i < m.length; i++){
            for (int j = 0; j < m[i].length; j++){

                soma += m[i][j];

            }
        }

        media = soma / (m.length * m[0].length);

        numeroMaisProximoMedia = soma;

        for (int i = 0; i < m.length; i++){
            for (int j = 0; j < m[i].length; j++){

                if (m[i][j] > media && m[i][j] < numeroMaisProximoMedia){
                    numeroMaisProximoMedia = m[i][j];
                }

            }
        }
        
        return numeroMaisProximoMedia;
    }
}