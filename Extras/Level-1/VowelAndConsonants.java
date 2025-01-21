public class VowelAndConsonants{
   public static void main(String[] args){
	   String string = "Sweta Kumari Agrawal";
        int vowels = 0, consonants = 0;
        string = string.toLowerCase();
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) >= 'a' && string.charAt(i) <= 'z') {
                if ("aeiou".indexOf(string.charAt(i)) != -1) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        System.out.println("The number of vowels are " + vowels + " and Consonants is " + consonants);
    }
}

