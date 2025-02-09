import java.util.Scanner;

public class SimuladorSaque {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor para saque: ");
        int valor = scanner.nextInt();

        int[] notas = {100, 50, 20, 10, 5, 2};
        int[] moedas = {1};

        System.out.println("Notas e moedas necessárias:");

        for (int i = 0; i < notas.length; i++) {
            int qtdNotas = valor / notas[i];
            if(qtdNotas > 0) {
                System.out.println(qtdNotas + " nota(s) de "  +  notas[i]);
                valor %= notas[i];

            }
            if (valor == 0) {
                break;
            }
        }

        if (valor > 0){
            System.out.println(valor + "moeda(s) de 1");
        }

        scanner.close();
    }
}
