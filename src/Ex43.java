import javax.swing.JOptionPane;

public class Ex43 {
    public static void main (String[] args){
        double ana = 1.10, maria = 1.50;

        JOptionPane.showMessageDialog(null, "Para Ana se tornar maior que Maria seriam necessário " +FunctionAnos(ana, maria)+ " anos! Ela teria " +ana+ " m de altura, enquanto Maria teria " +maria+ " m de altura.");
    }
    static int FunctionAnos(double ana, double maria){
        int anos = 0;
        while(ana <= maria){
            maria += 0.02;
            ana += 0.03;
            anos++;
        }
        return anos;
    }
}
