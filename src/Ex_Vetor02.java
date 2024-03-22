import java.util.Random;
public class Ex_Vetor02 {
    public static void main (String[] args){
        int[] vet = new int[100];
        int maior = 0, menor = 100000, soma = 0;
        Random aleatorio = new Random();

        for(int i = 0; i < 100; i++){
            vet[i] = aleatorio.nextInt(10000);
            if (vet[i] > maior){
                maior = vet[i];
            }
            if (vet[i] < menor){
                menor = vet[i];
            }
            soma += vet[i];
        }
        double media = (double) soma / 100;

        System.out.println("O maior valor é: " +maior);
        System.out.println("O menor valor é: " +menor);
        System.out.println("A media dos valores é: " +media);
    }
}
