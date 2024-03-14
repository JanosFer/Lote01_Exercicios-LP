import javax.swing.JOptionPane;

public class Ex45 {
    //Calcule e mostre a série 1 – 2/4 + 3/9 – 4/16 + 5/25 + ... + 15/225
    public static void main (String[] args) {
        double soma = 0;

        for (int i = 1; i <= 15; i++) {
            double denominador = Math.pow(i,2);
            if (i % 2 == 0){
                soma -= (i / denominador);
            }else if(i % 2 != 0){
                soma += (i / denominador);
            }
            System.out.println(soma);
        }

        JOptionPane.showMessageDialog(null, "O resultado da soma é: " +soma);
    }
}
