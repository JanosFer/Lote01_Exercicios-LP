import java.util.Random;
import javax.swing.JOptionPane;
public class Ex_Vetor06 {
    public static void main (String[] args){
        int[] vet = new int[20];
        boolean encontrado = false;
        Random aleatorio = new Random();

        for(int i = 0; i < 20; i++){
            vet[i] = aleatorio.nextInt(10);
        }

        int vsz = vet.length;

        for(int i = 0; i < (vsz - 1); i++){
            for(int j = 0; j < (vsz - i - 1); j++){
                if (vet[j] > vet[j + 1]){
                    int aux = vet[j];
                    vet[j] = vet[j + 1];
                    vet[j + 1] = aux;
                }
            }
        }

        int n = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor a ser procurado: "));
        int comeco = 1, fim = 20;
        while(comeco <= fim && !encontrado){
            int meio =(comeco + fim) / 2;
            if (vet[meio] == n){
                JOptionPane.showMessageDialog(null, "O valor informado está na posição: " +meio);
                encontrado = true;
            }else if(vet[meio] < n){
                comeco = meio + 1;
            }else{
                fim = meio - 1;
            }
        }
        if (!encontrado){
            JOptionPane.showMessageDialog(null, "O valor informado não foi encontrado!");
        }
    }
}
