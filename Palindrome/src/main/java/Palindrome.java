import java.util.*;

public class Palindrome {
    public static String buildPalindrome(String input) {
        // se asume que siempre llegan en minusculas
        // Se utiliza un HashMap debido a su facilidad de almacenar varios variables que tengan valores
        // y ademas porque su complejidad es O(1) al acceder a los datos
        Map<Character, Integer> CountCharacters = new HashMap<>();

        // Contar frecuencia de cada carácter
        // Esto se hace porque todos los caracteres deben tener frecuencia impar
        // Si es impar un caracter debe ir en el centro para formar el palindromo
        for (char c : input.toCharArray()) {
            if (CountCharacters.containsKey(c)) {
                CountCharacters.put(c, CountCharacters.get(c) + 1);
            } else {
                CountCharacters.put(c, 1);
            }
        }

        // Se hace un conteo de si un caracter es impar o no
        // solo un caracter podria tener una frecuencia impar si se desea formar el palindromo
        int oddCharacterCount = 0;
        Character middleCharacter = null;
        StringBuilder half = new StringBuilder();

        // La idea es recorrer el HashMap y evaluar los caracteres y cuantas veces aparece en la palabra
        // con esto se hacen las verificaciones si es palindroma o no.
        for (Map.Entry<Character, Integer> characterCount : CountCharacters.entrySet()) {
            char character = characterCount.getKey();
            int count = characterCount.getValue();

            if (count % 2 != 0) {
                oddCharacterCount++;
                // En caso donde mas de una caracter tenga frecuencia impar se termina el proceso
                if (oddCharacterCount > 1) return "Not Possible";
                // El caracter impar se coloca en el centro para poder hacer el palindromo
                middleCharacter = character;
            }

            // Se agrega la mitad de los caracteres al inicio
            for (int i = 0; i < count / 2; i++) {
                half.append(character);
            }
        }

        // Se concatena la mitad del palindromo + el caracter impar (si aplica)
        // y su parte invertida que da como resultado el palindromo
        StringBuilder palindrome = new StringBuilder();
        palindrome.append(half);
        if (middleCharacter != null) palindrome.append(middleCharacter);
        palindrome.append(half.reverse());
        return palindrome.toString();
    }

    public static void main(String[] args) {
        String[] inputs = {
                "asdasdasdasdf",
                "aepriorpio",
                "laTinaLavaAnita",
                "reconocer",
                "rrreeeeeerrrx",
                "ojo"
        };

        for (String input : inputs) {
            System.out.println("input: " + input);
            System.out.println("output: " + buildPalindrome(input));
            System.out.println();
        }
    }
}
