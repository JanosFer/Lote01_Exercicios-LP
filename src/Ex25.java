import javax.swing.JOptionPane;
public class Ex25 {
    static int horaInicial, horaFinal, minutoInicial, minutoFinal, horasJogadas = 0, minutosJogados = 0;
    static boolean jogadas = false;

    public static void main(String[] args){
        ProcedureTempo();
        JOptionPane.showMessageDialog(null, "A partida durou " +horasJogadas+ " horas e " +minutosJogados+ " minutos.");
    }
    static void ProcedureTempo(){
        while (!jogadas){
            horaInicial = Integer.parseInt(JOptionPane.showInputDialog("Informe apenas a HORA em que a partida iniciou: "));
            minutoInicial = Integer.parseInt(JOptionPane.showInputDialog("Informe apenas o MINUTO em que a partida iniciou: "));
            horaFinal = Integer.parseInt(JOptionPane.showInputDialog("Informe apenas a HORA em que o jogo acabou: "));
            minutoFinal = Integer.parseInt(JOptionPane.showInputDialog("Informe apenas o MINUTO em que o jogo acabou: "));

            int tempoIniMin = (horaInicial * 60) + minutoInicial;
            int tempoFinalMin = (horaFinal * 60) + minutoFinal;
            int tempoTotMin;

            if(tempoIniMin <= tempoFinalMin){
                tempoTotMin = tempoFinalMin - tempoIniMin;
            } else {
                tempoTotMin = (24 * 60 -tempoIniMin) + tempoFinalMin;
            }

            horasJogadas = tempoTotMin / 60;
            minutosJogados = tempoTotMin % 60;

            if (tempoTotMin > 1440){
                JOptionPane.showMessageDialog(null, "ERRO: A partida não pode durar mais do que 24h!\n Por fsvor informe os valores novamente.");
            }else {
                jogadas = true;
            }
        }
    }
}
