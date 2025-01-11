import java.util.Scanner;


public class ArrayConversion{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		//Taking inputs from user
		System.out.println("Enter rows ");
		int rows=sc.nextInt();
		System.out.println("Enter columns ");
		int columns=sc.nextInt();
		//creating an arrays
		 int matrix[][]= new int[rows][columns];
		 int[] array = new int[rows * columns];
		for(int i=0 ;i<rows;i++){
			for(int j=0 ;j<columns;j++){
                  matrix[i][j]=sc.nextInt();
                }     
		}
		//Copying 2D array content to 1D array
		int index=0;
		 for (int i = 0; i < rows; i++) 
        { 
            for (int j = 0; j < columns; j++) 
                array[index++]=matrix[i][j]; 
           
        } 
      
		System.out.println("Printing 1d Array ");
	   
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+ " ");
		}
		
		sc.close();
    
}
}