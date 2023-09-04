import java.util.HashMap;
import javax.swing.JOptionPane;

public class Parte2_8 {

    public static void main(String[] args) {
        HashMap<String, Double> notasEstudiantes = new HashMap<>();

        while (true) {
            String opcion = JOptionPane.showInputDialog("Seleccione una opción:\n1. Agregar estudiante y asignar nota\n2. Consultar nota de un estudiante\n3. Salir");

            switch (opcion) {
                case "1":
                    String nombreEstudiante = JOptionPane.showInputDialog("Ingrese el nombre del estudiante:");
                    double nota = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota del estudiante:"));

                    notasEstudiantes.put(nombreEstudiante, nota);
                    JOptionPane.showMessageDialog(null, "Nota asignada correctamente.");
                    break;

                case "2":
                    String nombreConsulta = JOptionPane.showInputDialog("Ingrese el nombre del estudiante para consultar la nota:");
                    Double notaConsulta = notasEstudiantes.get(nombreConsulta);

                    if (notaConsulta != null) {
                        JOptionPane.showMessageDialog(null, "La nota de " + nombreConsulta + " es: " + notaConsulta);
                    } else {
                        JOptionPane.showMessageDialog(null, "El estudiante no se encuentra en el registro.");
                    }
                    break;

                case "3":
                    JOptionPane.showMessageDialog(null, "La re buena ");
                    System.exit(0);
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida. Por favor, seleccione una opción válida.");
            }
        }
    }
}
