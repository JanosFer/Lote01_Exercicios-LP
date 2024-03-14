import javax.swing.JOptionPane;
public class Ex7 {
    public static void main (String[] args){
        double comprimento, largura, altura, volume;
        comprimento = Double.parseDouble(JOptionPane.showInputDialog("Informe o comprimento: "));
        largura = Double.parseDouble(JOptionPane.showInputDialog("Informe a largura: "));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Informe a altura: "));
        volume = comprimento * largura * altura;
        JOptionPane.showMessageDialog(null, "O volume é de: " +volume);
    }
}
