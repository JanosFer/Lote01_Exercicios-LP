import javax.swing.JOptionPane;

public class Ex17 {
    static Double litros, kml, velMedia, temPercurso, distancia;

    public static void main (String[] args){
        kml = Double.parseDouble(JOptionPane.showInputDialog("Informe quantos km por litro o veículo faz: "));
        temPercurso = Double.parseDouble(JOptionPane.showInputDialog("Informe em minutos o tempo estimado do percurso: "));
        velMedia = Double.parseDouble(JOptionPane.showInputDialog("Informe em km/h a velocidade média do percurso: "));

        ProcedureCalcDistancia();
        JOptionPane.showMessageDialog(null, "Para percorrer este percurso, o veículo consumirá " +litros+ " litros.");
    }
    static void ProcedureCalcDistancia(){
        distancia = (temPercurso * 60) * velMedia;
        litros = kml * distancia;
    }
}
