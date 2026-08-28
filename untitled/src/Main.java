import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        String palavraSecreta = "MENSAGEM";

        char[] letrasDescobertas = new char[palavraSecreta.length()];
        for (int i = 0; i < letrasDescobertas.length; i++) {
            letrasDescobertas[i] = '_';
        }

        System.out.println("Palavra: " + String.valueOf(letrasDescobertas));

        System.out.print("Digite uma letras: ");
        Scanner scanner = new Scanner(System.in);
        char chute = scanner.next().toUpperCase().charAt(0);
        scanner.close();

        for (int i = 0; i < palavraSecreta.length(); i++) {
            if (palavraSecreta.charAt(i) == chute) {
                letrasDescobertas[i] = chute;
            }
        }

        System.out.println("Palavra: " + String.valueOf(letrasDescobertas));

    }
}

