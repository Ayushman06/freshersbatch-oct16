package assignment_1;
import java.util.Scanner;
public class ass1_3 {
	

		public static void main(String[] args) {
			Scanner obj = new Scanner(System.in);
			
			System.out.print("Enter the principal: ");
			double p=obj.nextInt();
			
			System.out.print("Enter the rate: ");
			double r=obj.nextInt();
			
			System.out.print("Enter the time: ");
			double t=obj.nextInt();
			
			System.out.print("Enter number of times interest is compounded: ");
		    double n = obj.nextInt();
			
			double i = (p*t*r)/100;
			System.out.println("si " + i);
		    
		    double ci= p * (Math.pow((1 + r/100), (t * n))) - p;
		    System.out.println("ci " + ci);
			obj.close();
		}
	}


