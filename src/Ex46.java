import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

public class Ex46 {
    public static void main (String[] args){
        int diaNasc, mesNasc = 0, anoNasc= 0, anos, meses = 0, nMeses = 0;
        boolean verifica = false;
        double juros = 1.005, gratificacao = 1.03, total = 0;

        GregorianCalendar cal = new GregorianCalendar();

        int diaAtual = cal.get(Calendar.DAY_OF_MONTH);
        int mesAtual = 1 + cal.get(Calendar.MONTH);
        int anoAtual = cal.get(Calendar.YEAR);

        while(!verifica){
            diaNasc = Integer.parseInt(JOptionPane.showInputDialog("Informe apenas o DIA de nascimento: "));
            mesNasc = Integer.parseInt(JOptionPane.showInputDialog("Informe apenas o MÊS de nascimento: "));
            anoNasc = Integer.parseInt(JOptionPane.showInputDialog("Informe apenas o ANO de nascimento: "));


            if(anoNasc > anoAtual){
                System.err.println("ERRO: O ano de nascimento não pode ser maior que o ano atual!\n Informe as datas novamente!");
            } else if(anoNasc < 1925){
                System.err.println("ERRO: Ano inválido! \n Informe as datas novamente!");
            }else if(anoNasc == anoAtual && (mesNasc > mesAtual || (mesNasc == mesAtual && diaNasc >= diaAtual))){
                System.err.println("ERRO: A data de nascimento não pode ser maior ou igual a data atual");
            } else if(!bissexto.ehBissexto(anoNasc) && mesNasc == 2 && diaNasc > 28){
                System.err.println("ERRO: Dia de nascimento inválido! Por favor informe as datas novamente");
            } else if(bissexto.ehBissexto(anoNasc) && mesNasc == 2 && diaNasc > 29){
                System.err.println("ERRO: Dia de nascimento inválido! Por favor informe as datas novamente");
            } else if(mes.ehLongo(mesNasc) && diaNasc > 31){
                System.err.println("ERRO: Dia de nascimento inválido! Por favor informe as datas novamente");
            } else if(!mes.ehLongo(mesNasc) && diaNasc > 30){
                System.err.println("ERRO: Dia de nascimento inválido! Por favor informe as datas novamente");
            } else if(mesNasc > 12 || mesNasc < 1){
                System.err.println("ERRO: Mês inválido! Por favor informe as datas novamente");
            }else{
                verifica = true;
            }
        }

        double deposito = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor que será depositado mensalmente: "));

        if(anoNasc < anoAtual){
            anos = anoAtual - anoNasc;
            if (mesNasc > mesAtual){
                anos -= 1;
                meses = mesNasc - mesAtual;
                nMeses = meses;
            } else if(mesNasc <mesAtual) {
                meses = mesAtual - mesNasc;
                nMeses = meses;
            }
            meses += anos * 12;

            for(int i = 1; i <= meses; i++){
                total = (total * juros) + deposito;
            }
            for(int i = anoNasc; i <= anoAtual; i++){
                if(bissexto.ehBissexto(i)){
                    total *= gratificacao;
                }
            }

            JOptionPane.showMessageDialog(null, "Depositando R$" +deposito+ " por mês, durante " +anos+ " anos e " +nMeses+ " meses, o valor total será de R$" +(float)total);

        }else if(anoNasc == anoAtual){
            while(mesNasc <= mesAtual){
                total = (total * juros) + deposito;
                mesNasc++;
                meses++;
            }
            if(bissexto.ehBissexto(anoNasc)){
                total *= gratificacao;
            }
            JOptionPane.showMessageDialog(null, "Depositando R$" +deposito+ " por mês, durante " +meses+ " meses, o valor total será de R$" +(float)total);
        }

    }
}

class bissexto {
    public static boolean ehBissexto(int ano){
        if(ano % 400 == 0){
            return true;
        } else if(ano % 4 == 0 && ano % 100 != 0){
            return true;
        } else
            return false;
    }
}

class mes {
    public static boolean ehLongo(int mes){
        if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){
            return true;
        } else
            return false;
    }
}