import javax.swing.JOptionPane;

public class Ex35 {
    public static void main (String[] args){
        int n, n1;

        n = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro valor: "));
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo valor: "));

        JOptionPane.showMessageDialog(null, "O valor da somatória dos numeros ímpares entre " +n+ " e " +n1+ " é de: " +FunctionSomaImpar(n, n1));
    }
    static int FunctionSomaImpar(int n1, int n2){
        int soma = 0;
        if(n1 > n2){
            for(int i = n2; i <= n1; i++){
                if(i % 2 != 0){
                    soma += i;
                }
            }
        }else{
            for(int i = n1; i <= n2; i++){
                if(i % 2 != 0){
                    soma += i;
                }
            }
        }
        return soma;
    }
}