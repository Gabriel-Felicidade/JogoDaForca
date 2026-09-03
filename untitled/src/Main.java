import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String palavraSecreta = "FELICIDADE";

        int vidas = 6;

        char[] letrasDescobertas = new char[palavraSecreta.length()];
        for (int i = 0; i < letrasDescobertas.length; i++) {
            letrasDescobertas[i] = '_';
        }

        String letrasTentadas = "";

        Scanner scanner = new Scanner(System.in);

        while (vidas > 0 && !acertouTodasAsLetras(letrasDescobertas)) {
            System.out.println("\n----------------------------------");
            desenharForca(vidas);
            imprimirProgressoFormatado(letrasDescobertas);
            System.out.println("Letras tentadas: " + (letrasTentadas.isEmpty() ? "Nenhuma" : letrasTentadas));
            System.out.println("Vidas reestantes: " + vidas);
            System.out.print("Digite uma letra: ");

            String entrada = scanner.next().toUpperCase();
            char chute = entrada.charAt(0);

            if (!Character.isLetter(chute)) {
                System.out.println("\nEntrada invalida! Digite apenas letras do alfabeto.");
                continue;
            }

            if (letrasTentadas.contains(String.valueOf(chute))) {
                System.out.println("\nVoce ja tentou a letra '" + chute + "'. Tente outra!");
                continue;
            }

            letrasTentadas += chute + " ";

            boolean acertouLetra = false;
            for (int i = 0; i < palavraSecreta.length(); i++) {
                if (palavraSecreta.charAt(i) == chute) {
                    letrasDescobertas[i] = chute;
                    acertouLetra = true;
                }
            }

            if (!acertouLetra) {
                vidas --;
                System.out.println("\nQue pena! A letra '" + chute + "' nao esta na palavra.");
            } else {
                System.out.println("\nBoa! Voce acertou a letra '" + chute + "'.");
            }
        }

        scanner.close();

        System.out.println("\n==================================");
        if (acertouTodasAsLetras(letrasDescobertas)) {
            imprimirProgressoFormatado(letrasDescobertas);
            System.out.println("PARABENS! Voce venceu! A palvra era: " + palavraSecreta);
        } else {
            desenharForca(vidas);
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

    private static void imprimirProgressoFormatado(char[] letras) {
        System.out.print("Palavra: ");
        for (int i = 0; i < letras.length; i++) {
            System.out.print(letras[i] + " ");
        }
        System.out.println();
    }

    private static void desenharForca(int vidas){
        System.out.println("  +---+");
        System.out.println("  |   |");

        switch (vidas) {
            case 6:
                System.out.println("      |");
                System.out.println("      |");
                System.out.println("      |");
                System.out.println("      |");
                break;
            case 5:
                System.out.println("  O   |");
                System.out.println("      |");
                System.out.println("      |");
                System.out.println("      |");
                break;
            case 4:
                System.out.println("  O   |");
                System.out.println("  |   |");
                System.out.println("      |");
                System.out.println("      |");
                break;
            case 3:
                System.out.println("  O   |");
                System.out.println(" /|   |");
                System.out.println("      |");
                System.out.println("      |");
                break;
            case 2:
                System.out.println("  O   |");
                System.out.println(" /|\\  |");
                System.out.println("      |");
                System.out.println("      |");
                break;
            case 1:
                System.out.println("  O   |");
                System.out.println(" /|\\  |");
                System.out.println(" /    |");
                System.out.println("      |");
                break;
            case 0:
            default:
                System.out.println("  O   |");
                System.out.println(" /|\\  |");
                System.out.println(" / \\  |");
                System.out.println("      |");
                break;
        }
        System.out.println("=========");
    }
}



