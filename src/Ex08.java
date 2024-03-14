import javax.swing.JOptionPane;
public class Ex08 {
    public static void main (String[] args){
        int meses = Integer.parseInt(JOptionPane.showInputDialog("Informe o número de meses após aplicação: "));
        double deposito, rendimento = 1.3 / 100;
        deposito = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor depositado em poupança: "));
        double total = deposito * Math.pow((1 + rendimento), meses);
        JOptionPane.showMessageDialog(null, "O valor do depósito após " +meses+ " é de: " +total);
    }
}
