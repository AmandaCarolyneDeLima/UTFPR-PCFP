//Amanda Carolyne de Lima
//Klesio Nascimento
//Marco Amaral
//DPSI

public class NumeroInteiro {

    private int n;

    public NumeroInteiro(int n) {
        this.n = n;
    }

    public double formula() {

        double somaimpar = 0;
        double somapar = 0;
        double fatora = 1;

        for (int i = 1; i <= this.n; i++) {

            fatora *= i;

            if( i %2 == 0 || i==1)
                somapar += 1 / fatora;

            else
                somaimpar -= 1 / fatora;
        }

        return somapar + somaimpar;
    }
}