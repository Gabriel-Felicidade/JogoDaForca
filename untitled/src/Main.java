public class Main {
    public static void main (String[] args) {
        String palavraSecreta = "MENSAGEM";

        char[] letrasDescobertas = new char [palavraSecreta.length()];
        for (int i = 0; i < letrasDescobertas.length; i++) {
            letrasDescobertas[i] = '_';
        }

        char chute = 'M';

        for (int i = 0; i < palavraSecreta.length(); i++) {
            if (palavraSecreta.charAt(i) == chute) {
                letrasDescobertas[i] = chute;
            }
        }

        System.out.println(String.valueOf(letrasDescobertas));
    }
}

