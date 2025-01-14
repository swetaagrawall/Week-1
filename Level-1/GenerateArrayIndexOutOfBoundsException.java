import java.util.Scanner;
public class GenerateArrayIndexOutOfBoundsException
{
	
	//defining method for computing simple interest
	public void generateArrayIndexOutOfBoundsException(int[] array , int index){
		array =new int[5];
		try{
			array[index];
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("ArrayIndexOutOfBoundsException is occured and handled");
		}
		
	}
	
	
	
	//main() method
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		//taking input
		int array[]= new array[5];
		for(int i=0 ;i<5 ;i++){
			array[i]=sc.nextInt();
		}
		
		int index=sc.nextInt();
		GenerateArrayIndexOutOfBoundsException cs=new GenerateArrayIndexOutOfBoundsException(array , index);
		cs.generateArrayIndexOutOfBoundsException(string);
		
		sc.close();
	}
}