public class Main {
    public static void main(String[] args) {

        int[][] m = new int[3][3];

        for (int i = 0; i < m.length; i++){
            for (int j = 0; j < m[i].length; j++){

                m[i][j] = (int)(Math.random() * 11);

            }
        }

        String str = "";

        for (int i = 0; i < m.length; i++){
            for (int j = 0; j < m[i].length; j++){

                str += m[i][j] + " ";

            }
            str += "\n";
        }
        
        System.out.println(str);
        
        MatrizDeInteiros matriz = new MatrizDeInteiros(m);
        
        System.out.println(matriz.escolhido());
    }
}
