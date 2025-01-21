public class ReverseString{
 public static void main(String[] args) {
        String string = "Sweta";
        String reversedString = "";
        for (int i = string.length() - 1; i >= 0; i--) {
            reversedString += string.charAt(i);
        }
        System.out.println("The reversed String of "+string+" is " + reversedString);
    }
    }
