import javax.swing.JOptionPane;

public class Ex40 {
    public static void main (String[] args){
        int n = 0, n1 = 0, maior, menor;
        boolean diferentes = false;
        while(!diferentes) {
            n = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro valor inteiro: "));
            n1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo valor inteiro: "));
            if(n == n1){
                System.err.println("ERRO: Os valores precisam ser diferentes!!! Por favor informe-os novamente.");
            }else{
                diferentes = true;
            }
        }

        if(n > n1){
            maior = n;
            menor = n1;
        }else {
            maior = n1;
            menor = n;
        }

        System.out.println("Os números primos entre " +maior+ " e " +menor+ " são: ");

        for(int i = menor; i <= maior; i++){
            if(verificaPrimo.ehPrimo(i)){
                System.out.println(i+ " ");
            }
        }
    }
}

class verificaPrimo{
    public static boolean ehPrimo(int numero){
        if (numero <= 1){
            return false;
        }
        for(int i = 2; i <= Math.sqrt(numero); i++){
            if (numero % i == 0){
                return false;
            }
        }
        return true;
    }
}