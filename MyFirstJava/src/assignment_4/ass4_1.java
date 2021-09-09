package assignment_4;
import java.util.Scanner;
public class ass4_1 {

	    public static void main(String[] args) {
	        try {
	            Scanner obj = new Scanner(System.in);
	            System.out.println("Enter the numerator: ");
	            int Dividend = obj.nextInt();
	            System.out.println("Enter the denominator: ");
	            int Divisor = obj.nextInt();
	            int result;
	            result=Dividend/Divisor;

	            System.out.println("Answer is : "+result);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }

	        System.out.println("Exception was handled");

	    }
	}


