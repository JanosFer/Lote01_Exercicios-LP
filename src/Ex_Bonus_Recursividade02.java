
import javax.swing.JOptionPane;
public class Ex_Bonus_Recursividade02{
    public static void main (String[] args){
        int n = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor do fatorial a ser calculado: "));

        JOptionPane.showMessageDialog(null, "O fatorial de " +n+ " é " +fatorial(n));
    }

    static int fatorial(int n){
        if(n == 1){
            return n;
        }
        return n * fatorial(n - 1);
    }
}
