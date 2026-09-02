import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String palavraSecreta = "MENSAGEM";

        int vidas = 6;

        char[] letrasDescobertas = new char[palavraSecreta.length()];
        for (int i = 0; i < letrasDescobertas.length; i++) {
            letrasDescobertas[i] = '_';
        }

        Scanner scanner = new Scanner(System.in);

        while (vidas > 0 && !acertouTodasAsLetras(letrasDescobertas)) {
            System.out.println("\n----------------------------------");
            System.out.println("Palavra: " + String.valueOf(letrasDescobertas));
            System.out.println("Vidas reestantes: " + vidas);
            System.out.print("Digite uma letra: ");

            char chute = scanner.next().toUpperCase().charAt(0);

            boolean acertouLetra = false;

            for (int i = 0; i < palavraSecreta.length(); i++) {
                if (palavraSecreta.charAt(i) == chute) {
                    letrasDescobertas[i] = chute;
                    acertouLetra = true;
                }
            }

            if (!acertouLetra) {
                vidas--;
                System.out.println("\nQue pena! A letra '" + chute + "' nao esta na palavra.");
            } else {
                System.out.println("\nBoa! Voce acertou a letra '" + chute + "' .");
            }

        }
        scanner.close();

        System.out.println("\n==================================");
        if (acertouTodasAsLetras(letrasDescobertas)) {
            System.out.println("PARABENS! Voce venceu! A palvra era: " + palavraSecreta);
        } else {
            System.out.println("FIM DE JOGO! Suas vidas acabaram. A palavra era: " + palavraSecreta);
        }
            System.out.println("==================================");
    }
    private static boolean acertouTodasAsLetras(char[] letras) {
        for (int i = 0; i < letras.length; i++) {
            if (letras[i] == '_') {
                return false;
            }
        }
        return true;
    }
}