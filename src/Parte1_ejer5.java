import javax.swing.JOptionPane;

public class Parte1_ejer5 {

    public static void main(String[] args) {
        
        int[] arreglo1 = {1, 2, 3, 4, 5};
        int[] arreglo2 = {5, 4, 3, 2, 1};

        int[] resultado = sumarArreglos(arreglo1, arreglo2);

        JOptionPane.showMessageDialog(null, "Resultado de la suma de arreglos:\n" + arrayToString(resultado));
    }

    public static int[] sumarArreglos(int[] arreglo1, int[] arreglo2) {
        int tamano = arreglo1.length;
        int[] resultado = new int[tamano];

        for (int i = 0; i < tamano; i++) {
            resultado[i] = arreglo1[i] + arreglo2[i];
        }

        return resultado;
    }

    public static String arrayToString(int[] arreglo) {
        String resultado = "";

        for (int i = 0; i < arreglo.length; i++) {
            resultado += arreglo[i];
            if (i < arreglo.length - 1) {
                resultado += ", ";
            }
        }

        return resultado;
    }
}

