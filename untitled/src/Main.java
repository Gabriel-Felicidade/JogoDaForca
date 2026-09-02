import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        String palavraSecreta = "MENSAGEM";

        int vidas = 6;

        char[] letrasDescobertas = new char[palavraSecreta.length()];
        for (int i = 0; i < letrasDescobertas.length; i++) {
            letrasDescobertas[i] = '_';
        }

        Scanner scanner = new Scanner(System.in);

        System.out.println("Palavra: " + String.valueOf(letrasDescobertas));
        System.out.println("Vidas restantes: " + vidas);

        System.out.print("Digite uma letras: ");
        char chute = scanner.next().toUpperCase().charAt(0);
        scanner.close();

        boolean acertouLetra = false;

        for (int i = 0; i < palavraSecreta.length(); i++) {
            if (palavraSecreta.charAt(i) == chute) {
                letrasDescobertas[i] = chute;
                acertouLetra = true;
            }
        }

        if (!acertouLetra) {
            vidas--;
            System.out.println("\nQue pena! A Letra '" + chute + "' nao esta na palavra.");
        } else {
            System.out.println("\nBoa! Voce acertou a letra '" + chute + "'.");
        }

        System.out.println("Palavra: " + String.valueOf(letrasDescobertas));
        System.out.println("VIdas restantes: " + vidas);
    }
}

