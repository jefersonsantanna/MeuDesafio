public class BuscaBinaria {
    public static void main(String[] args) {
        int[] lista = {5, 12, 18, 23, 45, 70, 89};
        System.out.println("Indice: " + buscaBinaria(lista, 23));
    }

    public static int buscaBinaria(int[] lista, int alvo) {
        int esquerda = 0, direita = lista.length - 1, resultado = -1;

        while (esquerda <= direita) {
            int meio = (esquerda + direita) / 2;

            if (lista[meio] >= alvo) {
                if (lista[meio] == alvo) resultado = meio;
                direita = meio - 1;
            } else {
                esquerda = meio + 1;

            }

        }
        return resultado;
    }
}







