import javax.swing.JOptionPane;
public class Ex29 {
    static double valorInvestido = 0, rendimento = 0;
    static int tipoInvestimento = 0;
    static boolean verifica = false;

    public static void main(String[] args) {
        ProcedureVerifica();
        ProcedureCalcula();
        JOptionPane.showMessageDialog(null, "Após 30 dias o valor corrigido é de R$" +rendimento);
    }
    static void ProcedureVerifica(){
        while(!verifica) {
            tipoInvestimento = Integer.parseInt(JOptionPane.showInputDialog("Informe o tipo de investimento digitando 1 para poupança e 2 para renda fixa: "));

            if(tipoInvestimento != 1 && tipoInvestimento!= 2){
                JOptionPane.showMessageDialog(null, "Tipo de investimento invalido!\n Informe um valor válido");
            }else{
                verifica = true;
            }
            valorInvestido = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor investido: "));
        }
    }
    static void ProcedureCalcula(){
        if(tipoInvestimento == 1){
            rendimento = valorInvestido * 1.03;
        }else if(tipoInvestimento == 2){
            rendimento = valorInvestido * 1.05;
        }

    }
}
