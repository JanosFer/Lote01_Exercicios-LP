import javax.swing.JOptionPane;
public class Ex26 {
    static int n = 0, n1 = 0;
    static boolean diferentes = false;

    public static void main(String[] args) {
        ProcedureRecebe();

        if(n > n1){
            if(n % n1 == 0){
                JOptionPane.showMessageDialog(null, n+" é multiplo de " +n1+ ".");
            }else{
                JOptionPane.showMessageDialog(null, n+" não é multiplo de " +n1+ ".");
            }
        }else{
            if(n1 % n == 0){
                JOptionPane.showMessageDialog(null, n1+" é multiplo de " +n+ ".");
            }else{
                JOptionPane.showMessageDialog(null, n1+" não é multiplo de " +n+ ".");
            }
        }
    }
    static void ProcedureRecebe(){
        while(!diferentes) {
            n = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro valor: "));
            n1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo valor: "));
            if(n == n1){
                JOptionPane.showMessageDialog(null, "ERRO: Valores iguais!\n Por Favor insira dois valores diferentes!");
            }else{
                diferentes = true;
            }
        }
    }
}
