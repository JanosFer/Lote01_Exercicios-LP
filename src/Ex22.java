import javax.swing.JOptionPane;

public class Ex22 {
    static double[] ordem = new double[2];

    public static void main (String[] args){
        for (int i = 0; i < 2; i++){
            ordem[i] = Double.parseDouble(JOptionPane.showInputDialog("Informe o " +(i + 1)+ "° número"));
        }
        ProcedureOrdem();
        System.out.println("A ordem crescente dos valores é: ");
        for (int i = 0; i < 2; i++){
            System.out.print(ordem[i] + "  ");
        }
    }
    static void ProcedureOrdem(){
            if(ordem[0] == ordem[1]){
                while(ordem[0] == ordem[1]){
                    ordem[1] = Double.parseDouble(JOptionPane.showInputDialog("ERRO: Os valores não podem ser iguais! \n Por favor informe o 2° número novamente: "));
                }
            }else if(ordem[0] > ordem[1]){
                double aux = ordem[0];
                ordem[0] = ordem[1];
                ordem[1] = aux;
            }
    }
}