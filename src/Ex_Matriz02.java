import java.util.Random;
public class Ex_Matriz02 {
    public static void main (String[] args){
        int[][] mat = new int[4][4];
        Random aleatorio = new Random();

        for (int x = 0; x < 4; x++){
            for (int y = 0; y < 4; y++){
                mat[x][y] = aleatorio.nextInt(100);
                if(x == y){
                    mat[x][y] = (int) Math.pow(4, x);
                }
                System.out.print(mat[x][y]+ " ");
            }
        }
    }
}
