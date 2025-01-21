public class LongestWord{
 public static void main(String[] args) {
        String sentence = "Sweta Kumari Agrawal";
        String[] words = sentence.split(" ");
        String longestWord = "";
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        System.out.println("Longest Word in sentence is \""+sentence+"\" is "+longestWord);
    }
}