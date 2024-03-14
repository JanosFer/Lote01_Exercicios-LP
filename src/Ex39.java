import javax.swing.JOptionPane;
public class Ex39 {
    public static void main (String[] args){
        int n = 32;

        JOptionPane.showMessageDialog(null, "o total de grãos no tabuleiro é de: " +FunctionGrao(n));
    }
    static long FunctionGrao(int n){
        long grao = 1, total = 1;

        for (int i = 2; i <= n; i++){
            grao *= 2;
            total += grao;
        }
        return total;
    }
}
