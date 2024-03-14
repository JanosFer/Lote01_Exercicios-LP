import javax.swing.JOptionPane;
public class Ex3 {
    public static void main(String[] args){
        double base, altura, area;
        base = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da base do triângulo: "));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da altura do triângulo: "));
        area = (base * altura)/2;
        JOptionPane.showMessageDialog(null, "A área do triângulo é de: " + area);
    }
}
