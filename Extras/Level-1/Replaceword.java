public class Replaceword {
   public  String replaceWord(String sentence, String toReplace, String replacedword) {
      if (sentence == null || toReplace == null || replacedword == null) {
            return null;
        }
         return sentence.replace(toReplace, replacedword);
    }

    public static void main(String[] args) {
        String sentence = "Sweta Kumari";
        String toReplace = "Kumari";
        String replacedword = "Agrawal";
		Replaceword rw = new Replaceword();
        String updatedSentence = rw.replaceWord(sentence, toReplace, replacedword);
        System.out.println("Sentence before replacement " + sentence);
        System.out.println("Sentence after replacement " + updatedSentence);
    }
}
