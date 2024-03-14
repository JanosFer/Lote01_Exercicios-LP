import javax.swing.JOptionPane;

public class Ex42 {
    //Calcule e mostre a série 1 + 2/3 + 3/5 + ... + 50/99
    public static void main (String[] args){
        double den = 1, num, serie = 1;

        for(num = 2; num <=50; num++){
            den += 2;
            System.out.println(den);
            serie += (num/den);
        }
        JOptionPane.showMessageDialog(null, "O valor final da série é de: " +serie);
    }
}
