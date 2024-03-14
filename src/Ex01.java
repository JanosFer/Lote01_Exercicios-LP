import javax.swing.JOptionPane;


public class Ex01 {
    public static void main(String[] args) {
        double lado, area;
        lado = Double.parseDouble(JOptionPane.showInputDialog("informe o valor do lado do quadrado: "));
        area = lado * lado;
        JOptionPane.showMessageDialog(null, "A área do quadrado é: " + area);
    }
}