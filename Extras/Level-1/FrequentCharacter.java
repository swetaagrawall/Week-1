public class FrequentCharacter{
 public static void main(String[] args) {
        String string = "success";
		int max=0 , index=0;
        int mostfrequent[]=new int[26];
		for(int i=0;i<string.length();i++){
			mostfrequent[string.charAt(i)-'a']++;
		}
		for(int i=0;i<26;i++){
			if(mostfrequent[i]>max){
				max=mostfrequent[i];
				index=i;
			}
		}
		System.out.println("The most frequent character in \""+string+"\" is "+(char)(index+'a'));
    }
}
