public class MaiorSubstringPalindromica {
    public static void main(String[] args) {
        String str = "babad";
        System.out.println("Maior Substring Palindromica: " + encontrarMaiorPalindromo(str));
    }

    public static String encontrarMaiorPalindromo(String str) {
        String maiorPalindromo = "";

        for (int i = 0; i < str.length(); i++) {
            maiorPalindromo = maiorPalindromo.length()> expandir(str,i, i).length()? maiorPalindromo: expandir(str,i,i);
            maiorPalindromo = maiorPalindromo.length()> expandir(str,i,i + 1).length()? maiorPalindromo: expandir(str,i,i +1);
        }

        return maiorPalindromo;
    }

    public static String expandir (String str, int esquerda, int direita) {
        while (esquerda >= 0 && direita < str.length() && str.charAt(esquerda)== str.charAt(direita)){
            esquerda--;
            direita++;
        }
        return str.substring(esquerda + 1, direita);


    }

}
