import javax.swing.JOptionPane;
public class Ex28 {
    static double mediaMensal, precoAtual, novoPreco;
    public static void main(String[] args) {

        mediaMensal = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da média mensal de vendas do produto: "));
        precoAtual = Double.parseDouble(JOptionPane.showInputDialog("Informe o preço atual do produto: "));

        ProcedureExibeCalc();
    }
    static void ProcedureExibeCalc(){
        if(mediaMensal >= 1000 && precoAtual >= 80) {
            novoPreco = precoAtual - (precoAtual * 0.05);
            JOptionPane.showMessageDialog(null, "o novo preço é de R$ " + novoPreco);
        } else if(mediaMensal >= 500 && precoAtual >= 30){
            novoPreco = precoAtual + (precoAtual * 0.15);
            JOptionPane.showMessageDialog(null, "o novo preço é de R$ " +novoPreco);
        }else if (mediaMensal < 500 && precoAtual < 30){
            novoPreco = precoAtual + (precoAtual * 0.10);
            JOptionPane.showMessageDialog(null, "o novo preço é de R$ " +novoPreco);

        }else {
            JOptionPane.showMessageDialog(null, "o preço atual será mantido");
        }
    }
}
