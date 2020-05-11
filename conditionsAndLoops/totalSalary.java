import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
        Scanner s = new Scanner(System.in);
        
        int basicSalary = s.nextInt();
        char grade = s.next().charAt(0);
        
        double hra, da, pf; int allow;
        if (grade == 'A'){
            allow = 1700;
        } else if (grade == 'B'){
            allow = 1500;
        } else {
            allow = 1300;
        }
        
        hra = (0.2*basicSalary);
        da = (0.5*basicSalary);
        pf = (0.11*basicSalary);
        
        double totalSalary = (basicSalary + hra + da + allow - pf);
        int ans = (int)Math.round(totalSalary);
        System.out.println(ans);

	}
}
