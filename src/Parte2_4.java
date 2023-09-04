public class Parte2_4 {
    public static void main(String[] args) {
        int[] arreglo = {5, 8, 2, 10, 15, 7, 3};

        int valorMaximo = encontrarValorMaximo(arreglo);

        if (valorMaximo != 0) {
            System.out.println("El valor máximo en el arreglo es: " + valorMaximo);
        } else {
            System.out.println("El arreglo no contiene valores.");
        }
    }

    // Método que encuentra el valor máximo 
    public static int encontrarValorMaximo(int[] arreglo) {
        int maximo = arreglo[0]; // Asignamos el primer elemento como máximo inicial

        for (int i = 1; i < arreglo.length; i++) {
            if (arreglo[i] > maximo) {
                maximo = arreglo[i]; // Actualizamos el máximo si encontramos un valor mayor
            }
        }

        return maximo;
    }
}

