public class Ex_Vetor05 {
    public static void main (String[] args){
        int[] a = new int[20];
        int soma = 0;

        for(int i = 0; i < 20; i++){
            a[i] = i;
        }

        for(int i = 0; i < 10; i++){
            soma += a[i] - a[19 - i];
        }
        System.out.println("O total da soma é: " +soma);
    }
}
