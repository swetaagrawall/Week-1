import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        double[] salary = new double[10];
        int[] yearsOfService = new int[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];
        double totalBonus = 0.0d;
        double totalOldSalary = 0.0d;
        double NewSalary = 0.0d;
		int years=0 ; double sal=0.0d;
        for (int i = 0; i < 10; i++) {
			 do {
				System.out.println("Enter salary for employee " + (i + 1));
                 sal = sc.nextDouble();
                System.out.println("Enter years of service for employee " + (i + 1));
                 years = sc.nextInt();
                 if (sal <= 0 || years < 0) {
                    System.out.println("please enter a positive integer");
                }
            } while (sal <= 0 || years < 0);
			salary[i] = sal;
			yearsOfService[i] = years;
                   
		}
        for (int i = 0; i < 10; i++) {
            double bon;
            if (yearsOfService[i] > 5) {
                bon = (salary[i]*5)/100;
            } else {
                bon =  (salary[i]*2)/100;
            }
            bonus[i] = bon;
            newSalary[i] = salary[i] + bon;
            totalBonus += bon;
            totalOldSalary += salary[i];
            NewSalary += newSalary[i];
		}
		System.out.println("Total bonus is "+ totalBonus);
        System.out.println("Total old salary of all employees is "+ totalOldSalary);
        System.out.println("Total new salary of all employees is "+ NewSalary);

        
		sc.close();
   }

}