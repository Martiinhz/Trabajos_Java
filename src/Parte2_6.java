public class Parte2_6 {
    public static void main(String[] args) {
        int[] arreglo1 = {1, 2, 3, 4, 5};
        int[] arreglo2 = {6, 7, 8, 9, 10};

        int[] resultado = sumarArreglos(arreglo1, arreglo2);

        if (resultado != null) {
            System.out.println("Resultado de la suma de arreglos:");
            for (int i = 0; i < resultado.length; i++) {
                System.out.println(resultado[i]);
            }
        } else {
            System.out.print("Los arreglos no tienen el mismo tamaño.");
        }
    }

 
    public static int[] sumarArreglos(int[] arreglo1, int[] arreglo2) {
        if (arreglo1.length != arreglo2.length) {
            return null; //
        }

        int[] resultado = new int[arreglo1.length];

        for (int i = 0; i < arreglo1.length; i++) {
            resultado[i] = arreglo1[i] + arreglo2[i];
        }

        return resultado;
    }
}
