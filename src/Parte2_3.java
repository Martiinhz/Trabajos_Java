import javax.swing.JOptionPane;
import java.util.Random;

public class Parte2_3 {
    public static void main(String[] args) {
       
        int numeroAleatorio = generarNumeroAleatorio();
        
        
        JOptionPane.showMessageDialog(null, "Número aleatorio entre 1 y 100: " + numeroAleatorio);
    }
    
    
    public static int generarNumeroAleatorio() {
        Random rand = new Random();
        return rand.nextInt(100);
    }
}
