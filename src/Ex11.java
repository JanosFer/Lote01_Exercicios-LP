import javax.swing.JOptionPane;
public class Ex11 {
    public static void main (String[] args){
        double raio, comprimento;
        raio = Double.parseDouble(JOptionPane.showInputDialog("Informe o raio da circunferência"));
        comprimento =  2 * Math.PI * raio;
        JOptionPane.showMessageDialog(null, "O comprimento da circunferência é de: " +comprimento);
    }
}
