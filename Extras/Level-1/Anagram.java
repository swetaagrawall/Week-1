import java.util.Scanner;
import java.util.Arrays;
public class Anagram{
 public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
        String str1 = "Sweta";
        String str2 = "SwetaAgrawal";
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
		for(int i=0 ;i<arr1.length;i++){	
        if (arr1[i]!=arr2[i]) {
            System.out.println("The strings \""+str1+"\" and \""+str2+"\" is not Anagrams");
			break;
        } else if((arr1[i]==arr2[i]) && (i==arr1.length-1)) {
            System.out.println("The strings \""+str1+"\" and \""+str2+"\" is  Anagrams");
        }
		}
    }
}
