package assignment_10;
import java.util.Arrays;
import java.util.List;

	public class ass10_3 {

	    public static void main(String[] args) {
	         String str = "A quick brown fox jumps over the lazy dog";

	        String[] arrlist = str.split(" ");
	        System.out.println(Arrays.toString(arrlist));

	        String[] str2=Arrays.stream(arrlist).toArray(size->new String[size]);

	        System.out.println(Arrays.toString(str2));
	    }
	}

