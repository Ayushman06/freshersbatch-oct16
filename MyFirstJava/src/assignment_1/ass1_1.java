package assignment_1;
import java.util.Scanner;
public class ass1_1 {
	
		public static void main(String[] args)
		{
			int n,r,m,f=0;
			Scanner obj = new Scanner(System.in);
			n=obj.nextInt();
			m=n;
			while(n>0)
			{
				r=n%10;
				f+=(r*r*r);
				n=n/10;
			}
			if(m==f)
				System.out.println("armstrong");
			else
				System.out.println("not armstrong");
			obj.close();
		}
	}


