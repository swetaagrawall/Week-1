public class SubstringOccurences{
 public static void main(String[] args) {
        String string = "swetasweta";
        String substring = "swe";
        int count = 0;
        int index = string.indexOf(substring);

        // Count occurrences of the substring
        while (index != -1) {
            count++;
            index = string.indexOf(substring, index + substring.length());
}
   System.out.println("The substring has occured "+count+" times.");
}
}