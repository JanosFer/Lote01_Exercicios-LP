public class Ex41 {
    public static void main (String[] args){
        System.out.println("Possibilidades de dois dados com soma igual 7: ");

        for(int dado1 = 1; dado1 <= 6; dado1++){
            for(int dado2 = 1; dado2 <= 6; dado2++){
                if (dado1 + dado2 == 7){
                    System.out.println("(" +dado1+ ", " +dado2+ ")");
                }
            }
        }
    }
}
