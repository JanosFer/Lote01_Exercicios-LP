import javax.swing.JOptionPane;
public class Ex4 {
    public static void main (String[] args){
        double celsius, fahrenheit;
        celsius = Double.parseDouble(JOptionPane.showInputDialog("Informe a temperatura em Celsius: "));
        fahrenheit = ((9 * celsius) + 160) / 5;
        JOptionPane.showMessageDialog(null, "A temperatura em Fahrenheit é de: " + fahrenheit);
    }

}
