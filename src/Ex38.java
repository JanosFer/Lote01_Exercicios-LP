import java.util.Random;
import javax.swing.JOptionPane;

public class Ex38 {
    public static void main(String[] args){
        int n, maior = 0, menor = 10000;

        Random aleatorio = new Random();
        for(int i = 0; i < 100; i ++){
            n = aleatorio.nextInt(9999);
            if (maior <= n){
                maior = n;
            }
            if (menor >= n){
                menor = n;
            }
        }

        JOptionPane.showMessageDialog(null, "O maior valor é de: " +maior);
        JOptionPane.showMessageDialog(null, "O menor valor é de: " +menor);
    }
}