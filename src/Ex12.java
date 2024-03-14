import javax.swing.JOptionPane;
import java.time.LocalDate;

public class Ex12 {
    public static void main (String[] args) {
        int ano, nasc, idade, anos, idadeFutura;
        ano = LocalDate.now().getYear();
        nasc = Integer.parseInt(JOptionPane.showInputDialog("Informe o seu ano de nascimento: "));
        anos = Integer.parseInt(JOptionPane.showInputDialog("Informe quantos anos no futuro você deseja saber a sua idade: "));
        idade = ano - nasc;
        idadeFutura = idade + anos;
        JOptionPane.showMessageDialog(null, "Você fez/fará " +idade+ " anos em " +ano+ " e fará " +idadeFutura+ " daqui " +anos+ " anos!");
    }
}
