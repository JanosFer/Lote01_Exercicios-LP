//serie3 = (1/1) + (1/2) + (1/3) + ... + (1/n)
import javax.swing.JOptionPane;
public class Ex_Recursividade03 {
    public static void main (String[] args){
        double num = Double.parseDouble(JOptionPane.showInputDialog("Informe um valor: "));

        JOptionPane.showMessageDialog(null, "O total é de: " +FrecIII(num));
    }

    static double FrecIII(double n){
        if (n == 1){
            return 1;
        }
        return 1/n + FrecIII(n-1);
    }
}
