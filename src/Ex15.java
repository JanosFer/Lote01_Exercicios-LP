import javax.swing.JOptionPane;

public class Ex15 {
    public static void main (String[] args){
        double cateto1, cateto2, hipotenusa;
        cateto1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor do Primeiro Cateto: "));
        cateto2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor do Segundo Cateto: "));
        hipotenusa = Math.pow(cateto1,2) + Math.pow(cateto2,2);
        hipotenusa = Math.sqrt(hipotenusa);
        JOptionPane.showMessageDialog(null, "O valor da hipotenusa é: " +hipotenusa);
    }
}
