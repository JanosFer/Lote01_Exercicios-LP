import javax.swing.JOptionPane;

public class Ex14 {
    public static void main (String[] args){
        double primeiroAng, segundoAng, terceiroAng;
        primeiroAng = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do primeiro ângulo: "));
        segundoAng = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do segundo ângulo:"));
        terceiroAng = 180 - (primeiroAng + segundoAng);
        JOptionPane.showMessageDialog(null, "O valor do terceiro ângulo é de: " +terceiroAng+ " graus.");
    }
}
