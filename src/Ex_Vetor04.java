import java.util.Random;
public class Ex_Vetor04 {
    public static void main (String[] args){
        double[] vet = new double[30];
        double media = 0;
        int acimaMedia = 0;
        Random aleatorio = new Random();

        for(int i = 0; i < 30; i++){
            vet[i] = aleatorio.nextDouble(10.1);
            media += vet[i];
        }

        media /= 30;

        for(int i = 0; i < 30; i++){
            if(vet[i] > media){
                acimaMedia += 1;
            }else if(vet[i] < media){
                System.out.println("A " +(i + 1)+ "ª nota está abaixo da média do grupo");
            }
        }
        System.out.println("A nota média do grupo foi de: " +media+ ". " +acimaMedia+ " foram acima da média");
    }
}
