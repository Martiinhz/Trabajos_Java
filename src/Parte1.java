import javax.swing.JOptionPane;
public class Parte1 {

	public static void main(String[] args) {
		
		 int opcion = Integer.parseInt(JOptionPane.showInputDialog("Elige una opción:\n"
	                + "1. Imprimir nombre completo\n"
	                + "2. Imprimir número mayor que 10\n"
	                + "3. Generar número aleatorio entre 1 y 100\n"
	                + "4. Encontrar el valor máximo en un arreglo de enteros"));

	        switch (opcion) {
	            case 1:
	                imprimirNombreCompleto();
	                break;
	            case 2:
	                int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un número entero:"));
	                imprimirNumeroMayorQue10(numero);
	                break;
	            case 3:
	                int numeroAleatorio = generarNumeroAleatorio();
	                JOptionPane.showMessageDialog(null, "Número aleatorio generado: " + numeroAleatorio);
	                break;
	            case 4:
	                int[] arreglo = {5, 15, 8, 25, 10};
	                int maximo = encontrarMaximo(arreglo);
	                JOptionPane.showMessageDialog(null, "El valor máximo en el arreglo es: " + maximo);
	                break;
	            default:
	                JOptionPane.showMessageDialog(null, "Opción no válida.");
	        }
	    }

	    
	    public static void imprimirNombreCompleto() {
	        JOptionPane.showMessageDialog(null, "Mi nombre completo es: Marti Eduardo Hernandez Sanchez");
	    }

	    
	    public static void imprimirNumeroMayorQue10(int numero) {
	        if (numero > 10) {
	            JOptionPane.showMessageDialog(null, "El número es mayor que 10: " + numero);
	        } else {
	            JOptionPane.showMessageDialog(null, "El número no es mayor que 10.");
	        }
	    }

	   
	    public static int generarNumeroAleatorio() {
	        return (int) (Math.random() * 100) + 1;
	    }

	    
	    public static int encontrarMaximo(int[] arreglo) {
	        int maximo = arreglo[0];
	        for (int i = 1; i < arreglo.length; i++) {
	            if (arreglo[i] > maximo) {
	                maximo = arreglo[i];
	            }
	        }
	        return maximo;
	    }
	

	}

