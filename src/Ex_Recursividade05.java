//serie5 = (n)! + (n - 1)! + (n - 2)! + ... (1)!
import javax.swing.JOptionPane;
public class Ex_Recursividade05 {
    public static void main (String[] args){
        int num = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor inteiro: "));

        JOptionPane.showMessageDialog(null, "O total é de: " +FrecV(num));
    }
    static int FrecV(int n){
        if (n == 0 || n == 1){
            return 1;
        }
        return FrecFat(n) + FrecV(n-1);
    }
    static int FrecFat(int num){
        if (num == 0 || num == 1){
            return 1;
        }
        return num * FrecFat(num - 1);
    }
}
