import java.util.ArrayList;

public class Parte2_5 {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        lista.add(5);
        lista.add(8);
        lista.add(2);
        lista.add(10);
        lista.add(77);
        lista.add(7);
        lista.add(3);

        int valorMaximo = encontrarValorMaximo(lista);

        System.out.println("El valor máximo en la lista es: " + valorMaximo);
    }

 
    public static int encontrarValorMaximo(ArrayList<Integer> lista) {
        if (lista.isEmpty()) {
            System.out.println("La lista está vacía.");
            return Integer.MIN_VALUE; // Valor mínimo de un entero como valor predeterminado
        }

        int maximo = lista.get(0);

        for (int i = 1; i < lista.size(); i++) {
            int elemento = lista.get(i);
            if (elemento > maximo) {
                maximo = elemento; 
            }
        }

        return maximo;
    }
}
