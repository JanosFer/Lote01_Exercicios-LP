
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

public class Ex30 {
    public static void main(String[] args) {
        int diaNasc, mesNasc, anoNasc, totalDias;

        GregorianCalendar cal = new GregorianCalendar();

        int diaAtual = cal.get(Calendar.DAY_OF_MONTH);
        int mesAtual = 1 + cal.get(Calendar.MONTH);
        int anoAtual = cal.get(Calendar.YEAR);

        while (true) {
            diaNasc = Integer.parseInt(JOptionPane.showInputDialog("Informe apenas o DIA de nascimento: "));
            mesNasc = Integer.parseInt(JOptionPane.showInputDialog("Informe apenas o MÊS de nascimento: "));
            anoNasc = Integer.parseInt(JOptionPane.showInputDialog("Informe apenas o ANO de nascimento: "));

            if (validaData(diaNasc, mesNasc, anoNasc, diaAtual, mesAtual, anoAtual)) {
                break;
            } else {
                System.err.println("Data de nascimento inválida! Por favor, informe novamente.");
            }
        }

        totalDias = calculadoraDias(diaNasc, mesNasc, anoNasc, diaAtual, mesAtual, anoAtual);

        JOptionPane.showMessageDialog(null, "A quantidade de dias vividos por alguém que nasceu em " + diaNasc + "/" + mesNasc + "/" + anoNasc + " é de: " + totalDias);
    }

    static boolean validaData(int diaNasc, int mesNasc, int anoNasc, int diaAtual, int mesAtual, int anoAtual) {
        if (anoNasc > anoAtual) {
            System.err.println("ERRO: O ano de nascimento não pode ser maior que o ano atual!");
            return false;
        } else if (anoNasc < 1925) {
            System.err.println("ERRO: Ano inválido!");
            return false;
        } else if (anoNasc == anoAtual && (mesNasc > mesAtual || (mesNasc == mesAtual && diaNasc >= diaAtual))) {
            System.err.println("ERRO: A data de nascimento não pode ser maior ou igual a data atual");
            return false;
        } else if (mesNasc > 12 || mesNasc < 1) {
            System.err.println("ERRO: Mês inválido!");
            return false;
        }
        return true;
    }

    static int calculadoraDias(int diaNasc, int mesNasc, int anoNasc, int diaAtual, int mesAtual, int anoAtual) {
        int totalDias = 0;

        while (diaNasc != diaAtual || mesNasc != mesAtual || anoNasc != anoAtual) {
            diaNasc++;
            if (diaNasc > quantosDias(mesNasc, anoNasc)) {
                diaNasc = 1;
                mesNasc++;
                if (mesNasc > 12) {
                    mesNasc = 1;
                    anoNasc++;
                }
            }
            totalDias++;
        }
        return totalDias;
    }

    static boolean ehBissexto(int ano) {
        return ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0);
    }

    static int quantosDias(int mes, int ano) {
        if (mes == 2) {
            return ehBissexto(ano) ? 29 : 28;
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            return 30;
        } else {
            return 31;
        }
    }
}
>>>>>>> 416f2f4 (adicionando Vetor, Matriz e Recursividade)
