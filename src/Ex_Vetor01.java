import java.util.Random;

public class Ex_Vetor01 {
    public static void main (String[] args){
        int[] vet = new int[50];
        int soma = 0, n = 0;
        double media = 0;
        Random aleatorio = new Random();

        for (int i = 0; i < 50; i++){
            vet[i] = aleatorio.nextInt(200);

            if(vet[i] % 2 != 0){
                soma += vet[i];
            }

            if (vet[i] >= 10 && vet[i] <= 200){
                media += vet[i];
                n++;
            }
        }
        media /= n;
        System.out.println("A média dos valores entre 10 e 200 é de: " +media);
        System.out.println("O total da soma dos números impares é de: " +soma);
    }
}
