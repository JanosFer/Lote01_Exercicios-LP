import java.util.Random;
public class Ex_Vetor03 {
    public static void main (String[] args){
        int[] vet = new int[3];
        int[] vet2 = new int[3];
        int[] vet3 = new int[6];
        Random aleatorio = new Random();

        for(int i = 0; i < 3; i++){
            vet[i] = aleatorio.nextInt(100);
            vet2[i] = aleatorio.nextInt(100);
            vet3[i] = vet[i];
            vet3[i+3] = vet2[i];
        }
        for(int i = 0; i < 6; i++){
            System.out.println(vet3[i]+ " ");
        }
    }

}
