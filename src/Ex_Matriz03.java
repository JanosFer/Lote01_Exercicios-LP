public class Ex_Matriz03 {
    public static void main (String[] args){
        int[][] mat = new int[8][8];
        int aux = 0;

        for(int x = 0; x < 8; x++){
            for(int y = 0; y < 8; y++){
                if(x == 0 && y == 0){
                    mat[x][y] = 1;
                }else{
                    mat[x][y] = aux * 2;
                }
                aux = mat[x][y];
                System.out.print(mat[x][y]+ " ");
            }
        }
    }
}
