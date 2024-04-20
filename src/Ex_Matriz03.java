public class Ex_Matriz03 {
    public static void main (String[] args){
        long[][] mat = new long[8][8];
        long aux = 0;

        for(int x = 0; x < 8; x++){
            for(int y = 0; y < 8; y++){
                if(x == 0 && y == 0){
                    mat[x][y] = 1;
                }else{
                    mat[x][y] = aux * 2;
                }
                aux = mat[x][y];
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
