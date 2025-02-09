import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número");
        int n = scanner.nextInt();
        scanner.close();

        if (n <= 0) {
            System.out.println("número inválido");
            return;
        }

        int[] fibonacci = new int[n];
        fibonacci[0] = 0;
        if (n > 1) fibonacci[1] = 1;

        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];

        }

        for (int num : fibonacci) {
            System.out.println(num + " ");
        }

    }

}


