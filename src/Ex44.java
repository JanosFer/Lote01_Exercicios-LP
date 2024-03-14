import javax.swing.JOptionPane;
public class Ex44 {
    public static void main (String[] args){

        double base = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da base: "));
         int expoente = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor do expoente: "));

        //potencia = Math.pow(base, expoente);


        double potencia = resultado.calcularPotencia(base, expoente);
        JOptionPane.showMessageDialog(null, "O resultado da potência  de base " +base+ " e expoente " +expoente+ " é de " +potencia);
    }
}

class resultado {
    public static double calcularPotencia(double base, int expoente) {
        double potencia = 1;


        if (expoente == 1) {
            potencia = base;
        } else if (expoente > 1) {
            for (int i = 0; i < expoente; i++){
                potencia *= base;
            }
        } else if (expoente < 0) {
            for (int i = 0; i > expoente; i--){
                potencia /= base;
            }
        }
        return potencia;
    }
}