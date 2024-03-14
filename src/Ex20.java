import javax.swing.JOptionPane;

public class Ex20 {
    static Double delta, x, x1, x2, a, b, c;
    static String resultado;

    public static void main (String[] args){

        a = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor de A: "));
        b = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor de B: "));
        c = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor de C: "));

        ProcedureBhaskara();
        JOptionPane.showMessageDialog(null, resultado);
    }

    static void ProcedureBhaskara(){
        delta = ((b*b) -4 * a * c);

        if (delta < 0){
            resultado = "A equação não possui raízes reais.";
        } else if (delta == 0){
            x = -b / (2 * a);
            resultado = ("A equação possui uma raíz real: " +x);
        }else{
            x1 = (-b + Math.sqrt(delta)) / (2 * a);
            x2 = (-b - Math.sqrt(delta)) / (2 * a);
            resultado = ("A equação Possui duas raízes reais: \n x1 = " +x1+ "\n x2 = " +x2);
        }
    }
}