import javax.swing.JOptionPane;

public class Ex21 {
    static Double[] notas = new Double[4];
    static Double media = 0.0;
    static String resultado;

    public static void main(String[] args) {
        for (int i = 0; i <= 3; i++) {
            notas[i] = Double.parseDouble(JOptionPane.showInputDialog("Informe a " + (i + 1) + "ª nota: "));
            if (notas[i] < 0 || notas[i] > 10) {
                while (notas[i] < 0 || notas[i] > 10) {
                    notas[i] = Double.parseDouble(JOptionPane.showInputDialog("ERRO: Nota Inválida, por favor Informe notas de 0 à 10!!!\n Informe a " + (i + 1) + "ª nota: "));
                }
            }
            media += notas[i];
        }
        ProcedureNota();
        JOptionPane.showMessageDialog(null,resultado);
    }
    static void ProcedureNota(){
        media = (media / 4);
        if (media >= 6.0){
            resultado = ("Aluno APROVADO com média: " +media);
        } else if (media >= 3.0){
            resultado = ("Média: " +media+ "Aluno necessita fazer EXAME para recuperar nota!");
        }else{
            resultado = ("Média: " +media+ "Aluno RETIDO!");
        }
    }
}