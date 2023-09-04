import javax.swing.JOptionPane;
public class Parte2_1 {

	    public static void main(String[] args) {
	        mostrarNombreCompleto();
	    }

	    public static void mostrarNombreCompleto() {
	        String nombreCompleto = JOptionPane.showInputDialog("Ingresa su nombre");
	        JOptionPane.showMessageDialog(null, "Su nombre completo es: " + nombreCompleto);
	    }
	


	}


