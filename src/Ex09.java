import javax.swing.JOptionPane;
public class Ex09 {
    public static void main (String[] args){
        int a, b, soma;
        a = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor de A: "));
        b = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor de B: "));
        soma = (int) Math.pow(a,2) + (int) Math.pow(b,2);

        JOptionPane.showMessageDialog(null, "O valor da soma do quadrado de " +a+ " e do quadrado de " +b+ " é de: " +soma);


    }
}
