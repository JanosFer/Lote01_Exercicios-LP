import javax.swing.JOptionPane;

public class Ex32 {
    public static void main (String[] args){
        int n = Integer.parseInt(JOptionPane.showInputDialog("Informe um número inteiro: "));

        JOptionPane.showMessageDialog(null, "O fatorial de " +n+ " é " +FuncaoFatorial(n));
    }
    static int FuncaoFatorial(int n){
        int fat = 1;
        for(int i = 2; i <= n; i++){
            fat *= i;
        }
        return fat;
    }
}