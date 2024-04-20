import javax.swing.JOptionPane;

public class Ex_Bonus_Recursividade03 {
    public static void main (String[] args){
        int i = 1;

        int n = Integer.parseInt(JOptionPane.showInputDialog("Informe quantas vezes a série deverá repetir: "));

        JOptionPane.showMessageDialog(null, "Repetindo " +n+ " vezes, a série teve como total: " +seriePotencia(n, i));
    }

    static int seriePotencia(int n, int i){
        if(n == 1){
            return i;
        }
        return i + seriePotencia((n-1), (n*n));
    }
}