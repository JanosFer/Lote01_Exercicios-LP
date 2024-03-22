public class Ex_Matriz04 {
    public static void main (String[] args){
        int[][] mat = new int[8][8];

        for(int cta = 1; cta <= 4; cta++){
            int menorI = cta - 1;
            int maiorI = 7 - cta + 1;

            for(int i = menorI; i <= maiorI; i++){
                mat[menorI][i] = cta;
                mat[i][maiorI] = cta;
                mat[i][menorI] = cta;
                mat[maiorI][i] = cta;
            }
        }

        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[i].length; j++){
                System.out.print("\t" +mat[i][j]);
            }
            System.out.println();
        }
    }
}
