import java.util.HashMap;
import java.util.Scanner;

public class CharToMorse {
    public static void charsToMors() {
        //bulding Map dictonary of chars and mors code equivalent
        HashMap<String, String> dictionary = new HashMap<>();
        dictionary.put(" ", " ");
        dictionary.put("A", ".-");
        dictionary.put("B", "-...");
        dictionary.put("C", "-.-.");
        dictionary.put("D", "-..");
        dictionary.put("E", ".");
        dictionary.put("F", "..-.");
        dictionary.put("G", "--.");
        dictionary.put("H", "....");
        dictionary.put("I", "..");
        dictionary.put("J", ".---");
        dictionary.put("K", "-.-");
        dictionary.put("L", ".-..");
        dictionary.put("M", "--");
        dictionary.put("N", "-.");
        dictionary.put("O", "---");
        dictionary.put("P", ".--.");
        dictionary.put("Q", "--.-");
        dictionary.put("R", ".-.");
        dictionary.put("S", "...");
        dictionary.put("T", "-");
        dictionary.put("U", "..-");
        dictionary.put("V", "...-");
        dictionary.put("W", ".--");
        dictionary.put("X", ".--.");
        dictionary.put("Y", "-.--");
        dictionary.put("Z", "--..");

        dictionary.put("0", "-----");
        dictionary.put("1", ".----");
        dictionary.put("2", "..---");
        dictionary.put("3", "...--");
        dictionary.put("4", "....-");
        dictionary.put("5", ".....");
        dictionary.put("6", "-....");
        dictionary.put("7", "--...");
        dictionary.put("8", "---..");
        dictionary.put("9", "----.");

        Scanner scan = new Scanner(System.in);
        System.out.println("Type text to Convert: ");
        String inputText = scan.next();

        System.out.println("Input Text: " + inputText);

        String textToMorse = "";

        char[] charArray = inputText.toCharArray();
        for (char c : charArray) {
            textToMorse += dictionary.get((c + "").toUpperCase()) + "";
        }

        System.out.println("Morse equivalent: " + textToMorse);
    }
}
