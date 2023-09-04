import java.util.HashMap;
import javax.swing.JOptionPane;

public class Parte2_7 {
    public static void main(String[] args) {
       
        HashMap<String, String> diccionario = new HashMap<>();

        diccionario.put("hello", "hola");
        diccionario.put("apple", "manzana");
        diccionario.put("cat", "gato");
        diccionario.put("dog", "perro");
        diccionario.put("house", "casa");

        while (true) {
            
            String palabraIngles = JOptionPane.showInputDialog("Ingrese una palabra en inglés (o escriba 'salir' para salir):");

            if (palabraIngles.equalsIgnoreCase("salir")) {
                break;
            }
            String traduccion = diccionario.get(palabraIngles);

            if (traduccion != null) {
                JOptionPane.showMessageDialog(null, "La traducción al español es: " + traduccion);
            } else {
                JOptionPane.showMessageDialog(null, "Palabra no encontrada en el diccionario.");
            }
        }
    }
}
