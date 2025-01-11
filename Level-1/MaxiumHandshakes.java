public class MaxiumHandshakes {
    
}
public class MaxiumHandshakes{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
       //taking inputs from user
       System.out.println("Enter number of students ");
        int numberOfStudents=sc.nextInt();
      
       //Calculating the maximum number of handshakes
         int maximumNumberOfHandshakes = (numberOfStudents*(numberOfStudents-1))/2;
      
       //Printing output
        System.out.println("The number of possible handshakes are  "+(maximumNumberOfHandshakes));
        
      
    }
 }