//serie1 = (1+2+3+...+100)
public class Ex_Recursividade01 {
    public static void main (String[] args){
    int num = 1;
    System.out.println("O total é: " +FrecI(num));
}
    static int FrecI(int n){
        if (n > 100){
            return 0;
        }
        return n + FrecI(n + 1);
    }
}

