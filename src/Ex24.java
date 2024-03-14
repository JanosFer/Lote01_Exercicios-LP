import javax.swing.JOptionPane;
 class Ex24 {
     public static void main(String[] args){
         int n;

         n = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor inteiro: "));

         if(n % 2 == 0){
             JOptionPane.showMessageDialog(null, n+" é divisível por 2.");
         }
         if(n % 3 == 0){
             JOptionPane.showMessageDialog(null, n+" é divisível por 3.");
         }
         if (n % 2 !=0 && n % 3 != 0){
             JOptionPane.showMessageDialog(null, n+" não é divisível por 2 e nem por 3");
         }
     }
}
