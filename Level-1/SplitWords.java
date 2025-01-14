import java.util.Scanner;
public class SplitWords
{
	public int countWords(String string){
		int c=0;
		for(int i=0 ;i<string.length();i++){
			if( string.charAt(i)==' '){
				c++;
			}
				
		}
		return c;
	}
	public String[] checkSplitWords(String string , int c){
		String Words[]=new String[c+1];
		int j=0;
		String temp="";
		for(int i=0 ;i<string.length();i++){
			if(string.charAt(i)!=' '){
				temp+=string.charAt(i);
			}else if(string.charAt(i)==' ' ){
				Words[j++]=temp;
				temp=" ";
			}
		}
		Words[j]=temp;
		return Words;
		
	}
	public int[] countLength(String string , int c){
		int lengthWord[]=new int[c+1];
		int j=0;
		int count =0;
		for(int i=0 ;i<string.length();i++){
			if(string.charAt(i)!=' '){
				count++;
			}else if(string.charAt(i)==' '){
				lengthWord[j++]=count;
				count =0;
			}
		}
		lengthWord[j]=count;
		return lengthWord;
		
	}
	
	public String[][] TwoDArray(String[] Words , int[] lengthWord , int c){
		String[][] array=new String[c+1][2];
		int m=0 ,n =0;
		for(int i=0;i<=c;i++){
//for(int j=0 ; j<= c;j++){
				array[i][0]=Words[m++];
				array[i][1]=String.valueOf(lengthWord[n++]);
		//}
		}
		
		return array;
	}
	
	
	//main() method
		public static void main(String[]args){
	    Scanner sc=new Scanner(System.in);
		//taking input
		System.out.println("Enter a text :");
		String string=sc.nextLine();
		sc.nextLine();
		
		
		SplitWords sw= new SplitWords();
		int c=sw.countWords(string);
		String cw[]=sw.checkSplitWords(string , c);
		int cl[]=sw.countLength(string , c);
		String answer[][]=sw.TwoDArray(cw ,cl , c);
		for(int i=0;i<answer.length;i++){
			for(int j=0;j<answer[i].length;j++){
			System.out.print(answer[i][j] + " " );
		}
		  System.out.println();
		}
		
		sc.close();
	}
}