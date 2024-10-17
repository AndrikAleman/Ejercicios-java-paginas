package spring;

import javax.swing.*;

public class anagrama {
    /*
     * Escribe una función que reciba dos palabras (String) y retorne
     * verdadero o falso (Bool) según sean o no anagramas.
     * - Un Anagrama consiste en formar una palabra reordenando TODAS
     *   las letras de otra palabra inicial.
     * - NO hace falta comprobar que ambas palabras existan.
     * - Dos palabras exactamente iguales no son anagrama.
     */


    public static boolean areAnagrams(String s1, String s2) {
        // Eliminar espacios y convertir a minúsculas
        s1 = s1.replaceAll("\\s", "").toLowerCase();
        s2 = s2.replaceAll("\\s", "").toLowerCase();

        // Verificar si las palabras son iguales
        if (s1.equals(s2)) {
            return false;
        }

        // Verificar si tienen la misma longitud
        if (s1.length() != s2.length()) {
            return false;
        }

        // Convertir las palabras a arrays de caracteres y ordenarlos
        char[] chars1 = s1.toCharArray();
        char[] chars2 = s2.toCharArray();
        java.util.Arrays.sort(chars1);
        java.util.Arrays.sort(chars2);

        // Comparar los arrays ordenados
        return java.util.Arrays.equals(chars1, chars2);
    }

    public static void anagram() {
        String S1 = "cola";
        String S2 = "cloa";

        boolean areAnagrams = areAnagrams(S1, S2);

        if (areAnagrams) {
            System.out.println("Son anagramas");
        } else {
            System.out.println("No son anagramas");
        }
    }
}
