import javax.swing.JOptionPane;

public class Ex36 {
    public static void main (String[] args){
        double n = Double.parseDouble(JOptionPane.showInputDialog("Informe um número inteiro: "));

        JOptionPane.showMessageDialog(null, "O valor da série é de: " +FunctionSerieFat(n));
    }
    static double FunctionSerieFat(double n){
        double fat = 1, serie = 0;
        for(int i = 1; i <= n; i++) {
            fat *= i;
            serie += 1 / fat;
        }
        return serie;
    }
}