package assignment_1;
import java.util.Scanner;
public class ass1_5 {


	public static void main(String[] args) {
		// income tax
			System.out.println("enter ctc: ");
		try (Scanner sc = new Scanner(System.in)) {

			int ctc=sc.nextInt();
			
			if (ctc<180000) {
				System.out.println("exmpted from taxation due to ctc");
			}
			else if(ctc<300000){
				double tax_amount=ctc*0.1;
				System.out.println("Tax payable is " +tax_amount);
			}
			else if(ctc<500000){
				double tax_amount=ctc*0.2;
				System.out.println("Tax payable is " +tax_amount);
			}
			else if(ctc<1000000){
				double tax_amount=ctc*0.3;
				System.out.println("Tax payable is " +tax_amount);
			}
		}
	}

}


