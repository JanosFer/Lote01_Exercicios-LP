import javax.swing.JOptionPane;

public class Ex_Bonus_Recursividade01 {
    public static void main (String[] args) {
        int x, n;

        x = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor da Base: "));
        n = Integer.parseInt(JOptionPane.showInputDialog("Informe quantas vezes se repetirá: "));

        System.out.println("O valor da potencia de " + x + " elevado a " + n + " tem como resultado: " + SeriePotencia(x,n));
    }

    private static int SeriePotencia(int x, int n) {
        if(n == 1) {
            return x;
        }
        return x * SeriePotencia(x,n-1);
    }
}