//serie2 = (n) + (n-1) + (n-2) + ... + (1)
import javax.swing.JOptionPane;
public class Ex_Recursividade02 {
    public static void main (String[] args){
        int num = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor inteiro: "));

        JOptionPane.showMessageDialog(null, "O total é de: " +FrecII(num));
    }
    static int FrecII(int n){
        if (n == 1){
            return 1;
        }
        return n + FrecII(n-1);
    }
}
