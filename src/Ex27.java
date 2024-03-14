import javax.swing.JOptionPane;
public class Ex27 {
    static double voltas, extensao, tempo, velocidade;
    public static void main(String[] args) {
    ProcedureVelocidade();
    JOptionPane.showMessageDialog(null, "A velocidade média é de: " +velocidade);
    }
    static void ProcedureVelocidade(){
        extensao = Double.parseDouble(JOptionPane.showInputDialog("Informe em METROS a extensão do circuito: "));
        tempo = Double.parseDouble(JOptionPane.showInputDialog("Informe em MINUTOS a duração do percurso: "));
        voltas = Double.parseDouble(JOptionPane.showInputDialog("Informe o número de voltas do circuito: "));
        velocidade = (voltas * (extensao / 1000)) / (tempo / 60);
    }
}
