import java.util.Scanner;

public class NumeroPerfeito {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite um número: ");
        int n = scanner.nextInt();

        int soma = 0;

        for (int i = 1; i < n; i++) {
            if(n % i == 0) {
               soma += i;

            }
        }

        System.out.println(soma == n);

        scanner.close();

    }
}
