import javax.swing.JOptionPane;

public class Ex37 {
    public static void main (String[] args){
        int n, anterior = 0, atual = 1;

        n = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor inteiro:"));

        System.out.println("Série de fibonacci até o " +n+ "° termo");
        for(int i = 0; i < n; i++){
            System.out.print(anterior+ " ");
            int proximo = anterior + atual;
            anterior = atual;
            atual = proximo;
        }
    }
}