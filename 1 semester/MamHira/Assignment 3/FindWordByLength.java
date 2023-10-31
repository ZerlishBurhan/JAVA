import java.util.Scanner;

public class FindWordByLength {
    static String[] findWordsByLength(String[] array, int length) {
        int count = 0;
        for (String word : array) {
            if (word.length() == length) {
                count++;
            }
        }
        
        String[] findWords = new String[count];
        int index = 0;
        for (String word : array) {
            if (word.length() == length) {
                findWords[index] = word;
                index++;
            }
        }
        
        return findWords;
    }

    static int countVowels(String word) {
        int vowelCount = 0;
        String lowercaseWord = word.toLowerCase();
        
        for (int i = 0; i < lowercaseWord.length(); i++) {
            char ch = lowercaseWord.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            }
        }
        
        return vowelCount;
    }

    public static void main(String[] args) {
        String[] words = {"apple", "orange", "strawberry", "grape", "kiwi"};
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the desired word length: ");
        int desiredLength = input.nextInt();

        String[] foundWords = findWordsByLength(words, desiredLength);

        if (foundWords.length > 0) {
            for (String word : foundWords) {
                int vowelCount = countVowels(word);
                System.out.println("Word: " + word + " | Vowel Count: " + vowelCount);
            }
        } else {
            System.out.println("No word of length " + desiredLength + " found.");
        }
    }
}
