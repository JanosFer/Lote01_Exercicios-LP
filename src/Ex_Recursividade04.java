//serie4 = (n/1) + (n-1 / 2) + (n-2 / 3) + ... + (1/n)
import javax.swing.JOptionPane;
public class Ex_Recursividade04 {
    public static void main (String[] args){
        double num = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor inicial do numerador da série: "));
        double den = 1, retorno;

        retorno = FrecIV((float) num, den);
        System.out.printf("Soma da série = %.2f", retorno);
    }
    static double FrecIV(double n, double d){
        if (n > 1){
            return (n / d) + FrecIV(--n, ++d);
        }else{
            return n / d;
        }
    }
}
