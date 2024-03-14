import javax.swing.JOptionPane;

public class Ex19 {
    static Double num1 = 0.0, num2 = 0.0, maior;

    public static void main(String[] args) {
        boolean verifica = false;
        while(!verifica) {
            num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor: "));
            num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor: "));
            if (num1 == num2) {
                JOptionPane.showMessageDialog(null, "ERRO: Valores iguais! \n Por favor digite os valores novamente.");
            }else{
                verifica = true;
            }
        }
        ProcedureMaior();
        JOptionPane.showMessageDialog(null, "O maior valor é :" + maior);
    }
    static void ProcedureMaior(){
        if (num1 > num2){
            maior = num1;
        } else {
            maior = num2;
        }
    }
}