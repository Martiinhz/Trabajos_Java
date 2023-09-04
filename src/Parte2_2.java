import javax.swing.JOptionPane;

public class Parte2_2 {

    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número entero:"));
        
        
        imprimirNumeroSiEsMayorQue10(numero);
    }

    
    public static void imprimirNumeroSiEsMayorQue10(int numero) {
        if (numero > 10) {
            JOptionPane.showMessageDialog(null, "El número es mayor que 10 : " + numero);
        } else {
            JOptionPane.showMessageDialog(null, "El número no es mayor que 10");
        }
    }
}
