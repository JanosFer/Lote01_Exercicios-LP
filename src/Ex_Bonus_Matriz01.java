import java.util.Random;

public class Ex_Bonus_Matriz01 {
    public static void main (String[] args){
        int[][] mat = new int[8][8];

        Random random = new Random();

        for(int i = 0; i < 8; i++){
            for(int j = 0; j< 8; j++){
                mat[i][j] = random.nextInt(10, 100);
                if((i + j) == 7){
                    mat[i][j] = (int) Math.pow(2, i);
                }
                System.out.print(mat[i][j] + "\t");
            }
            System.out.println("\n");
        }
        System.out.println("********************************************************************");

        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                if((i + j) == 7){
                    mat[i][j] = mat[i][j];
                }else{
                    mat[i][j] /= mat[i][7 - i];
                }
            }
        }

        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                if((i + j) == 7){
                    mat[i][j] = 1;
                }
                System.out.print(mat[i][j] + "\t");
            }
            System.out.println("\n");
        }
    }
}
