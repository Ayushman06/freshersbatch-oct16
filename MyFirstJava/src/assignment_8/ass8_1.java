package assignment_8;

public class ass8_1 {

		public static void main(String[] args) {
			
			
			addinf funadd = (a,b) -> a+b;
			addinf fundiv = (a,b) -> a/b;
			addinf funsub = (a,b) -> a-b;
			addinf funmul = (a,b) -> a*b;
			
			int a = funadd.call(8, 8);
			int d = fundiv.call(8, 8);
			int s = funsub.call(8, 8);
			int m = funmul.call(8, 8);

			System.out.println("lambda functions add");
			System.out.println(a);
			System.out.println("lambda functions div");
			System.out.println(d);
			System.out.println("lambda functions sub");
			System.out.println(s);
			System.out.println("lambda functions mul");
			System.out.println(m);
			

		}

		
		interface addinf{
			int call(int a, int b);
		}
	}

