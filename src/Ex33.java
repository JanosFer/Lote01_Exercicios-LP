import javax.swing.JOptionPane;

public class Ex33 {
    public static void main (String[] args){
        double n = Integer.parseInt(JOptionPane.showInputDialog("Informe um número inteiro: "));

        JOptionPane.showMessageDialog(null, "O valor da série é de : " +FunctionSerie(n));
    }
    static double FunctionSerie(double n){
        double serie = 0;
        for (float i = 1; i <= n; i++){
            serie = (float)serie + (1 / i);
        }
        return serie;
    }
}