import javax.swing.JOptionPane;
public class Ex02 {
    public static void main(String[] args) {
        double salario, reajuste;
        salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do salário: "));
        reajuste = (salario * 1.15);
        JOptionPane.showMessageDialog(null, "O novo salário é de: " + reajuste);
    }
}
