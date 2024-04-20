import java.util.Random;
public class Ex_Matriz01 {
    public static void main (String[] args){
        int[][] mat = new int[4][3];
        int[] cadaProdMes = new int[3];
        int[] prodPorSem = new int[4];
        int totalMes = 0;
        Random aleatorio = new Random();

        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 3; j++){
                mat[i][j] = aleatorio.nextInt(100);
                prodPorSem[i] += mat[i][j];
                cadaProdMes[j] += mat[i][j];
                totalMes += cadaProdMes[j];
            }
        }
        for(int x = 0; x < 4; x++){
            System.out.println("A quantidade de produtos vendidos na semana " +(x+1)+ " foi de: " +prodPorSem[x]);
        }
        for(int y = 0; y < 3; y++){
            System.out.println("A quantidade de cada produto vendido no mês " +(y+1)+ " foi de: " +cadaProdMes[y]);
        }
        System.out.println("O total de produtos vendidos no mês foi de: " +totalMes);
    }
}
