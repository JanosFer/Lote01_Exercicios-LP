import javax.swing.JOptionPane;
import java.util.Random;
public class Ex_Caixa_Eletronico {
    static int[] notas = new int[6];
    static int[] ctb = new int[4];
    static int[][] saques = new int[100][4];
    static int banco, valorSaque = 0, total = 0, cts = 0, opc;
    static Random aleatorio = new Random();

    public static void main (String[] args){
        boolean end = false;
        while(!end){
            while (true) {
                opc = Integer.parseInt(JOptionPane.showInputDialog("Informe a opção a ser selecionada: \n 1-Carregar Notas \n 2-Registrar Saque \n 3-Exibir Estatisticas \n 9-Finalizar Programa"));
                if (opc == 1 || opc == 2 || opc == 3 || opc == 9) {
                    break;
                } else {
                    System.err.println("ERRO: Valor inválido!! Por favor, digite novamente.");
                }
            }
            switch (opc) {
                case 1:
                    carregaNotas();
                    break;
                case 2:
                    registraSaque();
                    break;
                case 3:
                    exibeEstatisticas();
                    break;
                case 9:
                    JOptionPane.showMessageDialog(null, "FIM");
                    end = true;
            }
        }
    }
    static void carregaNotas(){
        for(int i = 0; i < 6; i++){
            notas[i] = aleatorio.nextInt(100, 500);
        }
        total += (notas[0] * 100) + (notas[1] * 50) + (notas[2] * 20) + (notas[3] * 10) + (notas[4] * 5) +(notas[5] * 2);

    }

    static void registraSaque(){
        while(cts < 100 && total > 0) {
            banco = Integer.parseInt(JOptionPane.showInputDialog("Informe o Banco a ser operado: \n Digite: \n 1-Banco do Brasil \n 2-Santander \n 3-Itaú \n 4-Caixa "));
            valorSaque = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor a ser sacado: "));
            if(valorSaque < 5){
                System.err.println("ERRO: O valor minímo de saque é R$5,00!");
            }else if(valorSaque > 100000){
                System.err.println("ERRO: O valor maxímo de saque é R$100.000,00!");
            }else if(valorSaque > total){
                System.err.println("ERRO: O caixa não possui saldo suficiente para efetuar a operação!");
            }else{
                total -= valorSaque;
                saques[cts][banco - 1] = valorSaque;
                ctb[banco-1]++;
                break;
            }
        }

        JOptionPane.showMessageDialog(null, "Este Caixa Eletrônico possui: \n Notas de 100: " +notas[0]+ "; \n Notas de 50: " +notas[1]+ "; \n Notas de 20: " +notas[2]+ "; \n Notas de 10: " +notas[3]+ "; \n Notas de 5: " +notas[4]+ "; \n Notas de 2: " +notas[5]+ ".");
        int continuar = Integer.parseInt(JOptionPane.showInputDialog("Deseja continuar a operação mesmo assim? \n Digite: \n 1-Desejo continuar. \n 2-Não desejo continuar."));
        if (continuar != 1){
            opc = 9;
        }else{
            registraNotas();
        }
    }

    static void registraNotas(){
        int qtdNotas, notas100 = 0, notas50 = 0, notas20 = 0, notas10 = 0, notas5 = 0, notas2 = 0;


        while(valorSaque > 0){
            while(valorSaque % 2 != 0 && verificaQtdNotas(4)){
                valorSaque -= 5;
                notas5++;
                notas[4]--;
            }
            for(int i = 0; i < 6; i++){
                if(i == 0 && verificaQtdNotas(i)){
                    if(valorSaque >= 100){
                        while(true){
                            qtdNotas = Integer.parseInt(JOptionPane.showInputDialog("Informe quantas notas de 100 você deseja: "));
                            if(qtdNotas < notas[i]) {
                                if (qtdNotas >= 0 && (qtdNotas * 100) <= valorSaque) {
                                    notas[i] -= qtdNotas;
                                    valorSaque -= qtdNotas * 100;
                                    notas100 = qtdNotas;
                                    break;
                                } else if ((qtdNotas * 100) > valorSaque || qtdNotas < 0) {
                                    System.err.println("ERRO: Valor inválido!! Por favor, digite novamente!");
                                }
                            } else{
                                System.err.println("ERRO: Há somente " +notas[i]+ " notas nesse caixa eletrônico!! Por favor, informe uma quantidade menor de notas!");
                            }
                        }
                    }
                }else if(i == 1 && verificaQtdNotas(i)){
                    if(valorSaque >= 50){
                        while(true){
                            qtdNotas = Integer.parseInt(JOptionPane.showInputDialog("Informe quantas notas de 50 você deseja: "));
                            if(qtdNotas < notas[i]){
                                if(qtdNotas >= 0 && (qtdNotas * 50) <= valorSaque){
                                    notas[i] -= qtdNotas;
                                    valorSaque -= qtdNotas * 50;
                                    notas50 = qtdNotas;
                                    break;
                                }else if((qtdNotas * 50) > valorSaque || qtdNotas < 0){
                                    System.err.println("ERRO: Valor inválido!! Por favor, digite novamente!");
                                }
                            }else{
                                System.err.println("ERRO: Há somente " +notas[i]+ " notas nesse caixa eletrônico!! Por favor, informe uma quantidade menor de notas!");
                            }
                        }
                    }
                }else if(i == 2 && verificaQtdNotas(i)){
                    if(valorSaque >= 20){
                        while(true){
                            qtdNotas = Integer.parseInt(JOptionPane.showInputDialog("Informe quantas de notas de 20 você deseja: "));
                            if(qtdNotas < notas[i]){
                                if(qtdNotas >= 0 && (qtdNotas * 20) <= valorSaque){
                                    notas[i] -= qtdNotas;
                                    valorSaque -= qtdNotas * 20;
                                    notas20 = qtdNotas;
                                    break;
                                }else if((qtdNotas * 20) > valorSaque || qtdNotas < 0){
                                    System.err.println("ERRO: Valor inválido!! Por favor, digite novamente!");
                                }
                            }else{
                                System.err.println("ERRO: Há somente " +notas[i]+ " notas nesse caixa eletrônico!! Por favor, informe uma quantidade menor de notas!");
                            }
                        }
                    }
                }else if(i == 3 && verificaQtdNotas(i)){
                    if(valorSaque >= 10){
                        while(true){
                            qtdNotas = Integer.parseInt(JOptionPane.showInputDialog("Informe quantas notas de 10 você deseja: "));
                            if(qtdNotas < notas[i]){
                                if(qtdNotas >= 0 && (qtdNotas * 10) <= valorSaque){
                                    notas[i] -= qtdNotas;
                                    valorSaque -= qtdNotas * 10;
                                    notas10 = qtdNotas;
                                    break;
                                }else if((qtdNotas * 10) > valorSaque || qtdNotas < 0){
                                    System.err.println("ERRO: Valor inválido!! Por favor, digite novamente!");
                                }
                            }else{
                                System.err.println("ERRO: Há somente " +notas[i]+ " notas nesse caixa eletrônico!! Por favor, informe uma quantidade menor de notas!");
                            }
                        }
                    }
                }else if(i == 4 && verificaQtdNotas(i)){
                    if(valorSaque >= 5){
                        while(true){
                            qtdNotas = Integer.parseInt(JOptionPane.showInputDialog("Informe quantas notas de 5 você deseja: "));
                            if(qtdNotas < notas[i]){
                                if(qtdNotas >= 0 && (qtdNotas * 5) <= valorSaque){
                                    notas[i] -= qtdNotas;
                                    valorSaque -= qtdNotas * 5;
                                    notas5 = qtdNotas;
                                    break;
                                }else if((qtdNotas * 5) > valorSaque || qtdNotas < 0){
                                    System.err.println("ERRO: Valor inválido!! Por favor, digite novamente!");
                                }
                            }else{
                                System.err.println("ERRO: Há somente " +notas[i]+ " notas nesse caixa eletrônico!! Por favor, informe uma quantidade menor de notas!");
                            }
                        }
                    }
                }else if(i == 5 && verificaQtdNotas(i)){
                    if(valorSaque >= 2){
                        while(true){
                            qtdNotas = Integer.parseInt(JOptionPane.showInputDialog("Informe quantas notas de 2 você deseja: "));
                            if(qtdNotas < notas[i]){
                                if(qtdNotas >= 0 && (qtdNotas * 2) <= valorSaque){
                                    notas[i] -= qtdNotas;
                                    valorSaque -= qtdNotas * 2;
                                    notas2 = qtdNotas;
                                    break;
                                }else if((qtdNotas * 2) > valorSaque || qtdNotas < 0){
                                    System.err.println("ERRO: Valor inválido!! Por favor, digite novamente!");
                                }
                            }else{
                                System.err.println("ERRO: Há somente " +notas[i]+ " notas nesse caixa eletrônico!! Por favor, informe uma quantidade menor de notas!");
                            }
                        }
                    }
                }
            }
        }

        cts++;
        System.out.println(notas100 + "\n" + notas50 + "\n" + notas20 + "\n" + notas10 + "\n" + notas5 + "\n" + notas2);
    }

    static void exibeEstatisticas(){
        int[] maior = new int[4];
        int[] menor = new int[4];
        int[] media = new int[4];
        int[] totalSacado = new int[4];

        for(int i = 0; i < 4; i++){
            maior[i] = 0;
            menor[i] = 100000;
        }

        for(int i = 0; i < cts; i++){
            for(int j = 0; j < 4; j++){
                if(saques[i][j] > maior[j]){
                    maior[j] = saques[i][j];
                }
                if(saques[i][j] < menor[j]){
                    menor[j] = saques[i][j];
                }
                totalSacado[j] += saques[i][j];
            }
        }
        media[0] = totalSacado[0] / ctb[banco-1];
        media[1] = totalSacado[1] / ctb[banco-1];
        media[2] = totalSacado[2] / ctb[banco-1];
        media[3] = totalSacado[3] / ctb[banco-1];

        for(int i = 0; i < 4; i++){
            JOptionPane.showMessageDialog(null, "Banco de código: " +(i+1)+ "\n Total Sacado:" +totalSacado[i]+ "\n Saque Médio: " +media[i]+ "\n Maior Saque: " +maior[i]+ "\n Menor Saque: " +menor[i]);
        }
    }

    static boolean verificaQtdNotas(int i){
        return notas[i] > 0;
    }
}
