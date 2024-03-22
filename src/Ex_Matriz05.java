public class Ex_Matriz05 {
    public static void main (String[] args){
        int[][] mat = {
                {2, 4, 3, 6, 5, 3, 4, 2},
                {1, 1, 1, 1, 1, 1, 1, 1},
                {7, 7, 7, 7, 7, 7, 7, 7,},
                {7, 7, 7, 7, 7, 7, 7, 7,},
                {7, 7, 7, 7, 7, 7, 7, 7,},
                {7, 7, 7, 7, 7, 7, 7, 7,},
                {1, 1, 1, 1, 1, 1, 1, 1},
                {2, 4, 3, 6, 5, 3, 4, 2}
        };
        int[] vet = new int[8];



        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                vet[mat[i][j]]++;
            }
        }

        for(int i = 1; i <= 7; i++){
            System.out.println("O número de peças de codigo " +i+ " é de: "+vet[i]);
        }
    }
}
