import javax.swing.JOptionPane;

public class Ex16 {
    static Integer horas, nDependentes, dependentes = 0;
    static Double valorPorHora, bruto, liquido, pDesconto;

    public static void main (String[] args){
        horas = Integer.parseInt(JOptionPane.showInputDialog("Informe as horas trabalhadas: "));
        valorPorHora = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor recebido por hora: "));
        pDesconto = Double.parseDouble(JOptionPane.showInputDialog("Informe o percentual de desconto(sem '%'): "));
        dependentes = Integer.parseInt(JOptionPane.showInputDialog("Possui dependentes? 0-NÃO/1-SIM: "));

        ProcedureCalcSalario();
        JOptionPane.showMessageDialog(null, "O salario liquido é: " +liquido);
    }
    static void ProcedureCalcSalario(){
        bruto = horas * valorPorHora;
        if (dependentes == 1) {
            nDependentes = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de dependentes: "));
            liquido = bruto - (bruto * (pDesconto/100)) + (nDependentes * 100);

        } else {
            liquido = bruto - (bruto * (pDesconto / 100));
        }
    }
}
