import java.util.Random;
public class Ex_Matriz02 {
    public static void main (String[] args){
        int[][] mat = new int[8][8];
        Random aleatorio = new Random();

        for (int i = 0; i < 8; i++){
            for (int j = 0; j < 8; j++){
                mat[i][j] = aleatorio.nextInt(100);
                if(i == j){
                    mat[i][j] = (int) Math.pow(8, i);
                }
            }
        }

        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[i].length; j++){
                System.out.print("\t" +mat[i][j]);
            }
            System.out.println("\n");
        }
    }
}
