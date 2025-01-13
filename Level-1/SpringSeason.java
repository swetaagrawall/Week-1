import java.util.Scanner;
public class SpringSeason{
	//defining method to check whether its a spring season or not
	public boolean springSeason(int month,int day){
		boolean ans;
		if((month==3 &&(day>=20&&day<=31))||
		   (month==4 &&(day>=1&&day<=30))||
		   (month==5 &&(day>=1&&day<=31))||
		   (month==6 &&(day>=1&&day<=20)))
		    ans=true;
		else
			ans =false;
		return ans;
	}
	//main() method
	public static void main(String[]args){
		//taking input from command line
		int month=Integer.parseInt(args[0]);
		int day=Integer.parseInt(args[1]);
		SpringSeason s=new SpringSeason();
		boolean Spring=s.springSeason(month,day);
		System.out.println(day+"/"+month+" is spring season? "+Spring);		
	}
}
		
		