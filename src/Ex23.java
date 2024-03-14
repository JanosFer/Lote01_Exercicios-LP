import javax.swing.JOptionPane;

public class Ex23 {
    static double[] ordem = new double[4];

    public static void main (String[] args){
        ProcedureRecebe();
        ProcedureOrganiza();
        for (int i = 0; i < 4; i ++){
            System.out.println(ordem[i]);
        }
    }
    static void ProcedureRecebe(){
        for (int i = 0; i < 4; i++){
            if (i == 0){
                ordem[i] = Double.parseDouble(JOptionPane.showInputDialog("Informe um valor aleatório: "));
            }else if(i > 0 && i < 3){
                ordem[i] = Double.parseDouble(JOptionPane.showInputDialog("Informe o " +(i + 1)+ "° valor, ele precisa OBRIGATÓRIAMENTE ser maior que o valor anterior: "));
                if (ordem[(i-1)] > ordem[i]){
                    while (ordem[(i-1)] > ordem[i]){
                        ordem[i] = Double.parseDouble(JOptionPane.showInputDialog("ERRO: O " +(i+1)+ "° valor precisa ser MAIOR do que o " +i+ "° valor!!! \n Por favor informe um novo valor: "));
                    }
                }
            }else if (i == 3){
                ordem[i] = Double.parseDouble(JOptionPane.showInputDialog("Agora informe um ultimo valor não necessariamente em ordem: "));
            }
        }
    }
    static void ProcedureOrganiza(){
        for (int i = 0; i < 4; i++){
            if (ordem[i] > ordem[3]) {
                double aux = ordem[i];
                ordem[i] = ordem[3];
                ordem[3] = aux;
            }
        }
    }
}
