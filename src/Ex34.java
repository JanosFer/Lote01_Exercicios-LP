import javax.swing.JOptionPane;

public class Ex34 {
    public static void main (String[] args){

        int n = Integer.parseInt(JOptionPane.showInputDialog("Informe um número para calcular a tabuada de 0 à 10: "));

        System.out.println("A tabuada de 0 a 10 de " +n+ " é: ");

        for(int i = 0; i <= 10; i++){
            System.out.println(FunctionTabuada(i, n));
        }
    }
    static int FunctionTabuada(int i, int n){
        int tab = 1;
        tab= i * n;
        return tab;
    }
}