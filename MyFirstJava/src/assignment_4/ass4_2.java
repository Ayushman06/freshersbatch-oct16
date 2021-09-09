package assignment_4;
import java.util.Scanner;
public class ass4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a,b,c;
			@SuppressWarnings("resource")
			Scanner input=new Scanner(System.in);
			System.out.println("enter numerator: ");
			a=input.nextInt();
			System.out.println("enter denominator: ");
			b=input.nextInt();
			
			if(b==0) {
				throw new UnsupportedOperationException("you entered 0 as a value it is not used");
			}
			c=a/b;
			System.out.println("answer: "+c);
		}
		catch(ArithmeticException d) {
			System.out.println("error: "+d.getMessage());
			System.out.println("error:"+d);
		}
		catch(UnsupportedOperationException e) {
			System.out.println("error: "+e.getMessage());
			System.out.println("error:"+e);
			e.printStackTrace();
		System.out.println("end");
	}
}
}
