import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        Scanner grant = new Scanner(System.in);

        System.out.println("Input Your Data : ");
        String input = grant.nextLine();

        int wordCount = countWords(input);
        System.out.println("Word Set: " + wordCount);

        grant.close();
    }

    public static int countWords(String text) {
        if (text == null || text.isEmpty()) {
            return 0;
        }

        String[] words = text.split("\\s+");
        return words.length;
    }
}