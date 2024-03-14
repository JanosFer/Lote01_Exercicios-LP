import javax.swing.JOptionPane;
public class Ex06 {
    public static void main (String[] args){
        int x, y, z;
        x = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor de X: "));
        y = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor de Y: "));
        z = x;
        x = y;
        y = z;
        JOptionPane.showMessageDialog(null, "O valor de X é: " +x+ "\n O valor de y é: " +y);
    }
}
