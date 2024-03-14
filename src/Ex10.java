import javax.swing.JOptionPane;
public class Ex10 {
    public static void main (String[] args){
        double a, b, diferenca = 0;
        a = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor de A: "));
        b = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor de B: "));
        if (a > b){
            diferenca = a - b;
        }
        if (a < b){
            diferenca = b - a;
        }
        JOptionPane.showMessageDialog(null, "A diferença entre A e B é de: " +diferenca);
    }
}
