import javax.swing.JOptionPane;
public class Ex13 {
    public static void main (String[] args){
        double g, kg;
        int dias = 0;
        g = Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade de alimento e, kg: "));
        kg = g * 1000;
        while (kg > 0){
            kg -= 50;
            dias++;
        }
        JOptionPane.showMessageDialog(null, "O alimento irá durar por " +dias+ " dias");
    }
}
